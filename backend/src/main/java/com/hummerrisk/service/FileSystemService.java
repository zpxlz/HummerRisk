package com.hummerrisk.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hummerrisk.base.domain.*;
import com.hummerrisk.base.mapper.*;
import com.hummerrisk.base.mapper.ext.ExtFileSystemMapper;
import com.hummerrisk.base.mapper.ext.ExtFileSystemResultMapper;
import com.hummerrisk.base.mapper.ext.ExtFileSystemRuleMapper;
import com.hummerrisk.commons.constants.*;
import com.hummerrisk.commons.exception.HRException;
import com.hummerrisk.commons.utils.*;
import com.hummerrisk.controller.request.fs.FsRequest;
import com.hummerrisk.controller.request.fs.FsResultRequest;
import com.hummerrisk.controller.request.fs.FsRuleRequest;
import com.hummerrisk.dto.FsDTO;
import com.hummerrisk.dto.FsResultDTO;
import com.hummerrisk.dto.FsRuleDTO;
import com.hummerrisk.dto.HistoryFsResultDTO;
import com.hummerrisk.i18n.Translator;
import com.hummerrisk.service.impl.ExecEngineFactoryImp;
import com.hummerrisk.service.impl.IProvider;
import io.kubernetes.client.openapi.ApiException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author harris
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FileSystemService {

    @Resource
    private ExtFileSystemMapper extFileSystemMapper;
    @Resource
    private FileSystemMapper fileSystemMapper;
    @Resource
    private ExtFileSystemRuleMapper extFileSystemRuleMapper;
    @Resource
    private FileSystemRuleMapper fileSystemRuleMapper;
    @Resource
    private ExtFileSystemResultMapper extFileSystemResultMapper;
    @Resource
    private FileSystemResultMapper fileSystemResultMapper;
    @Resource
    private FileSystemResultLogMapper fileSystemResultLogMapper;
    @Resource
    private RuleTagMapper ruleTagMapper;
    @Resource
    private RuleTagMappingMapper ruleTagMappingMapper;
    @Resource
    private FileSystemResultItemMapper fileSystemResultItemMapper;
    @Resource
    private ProxyMapper proxyMapper;
    @Resource
    private HistoryService historyService;
    @Resource
    private NoticeService noticeService;
    @Resource
    private ExecEngineFactoryImp execEngineFactoryImp;
    @Resource
    private HistoryFileSystemResultMapper historyFileSystemResultMapper;
    @Resource
    private HistoryFileSystemResultLogMapper historyFileSystemResultLogMapper;


    public List<FsDTO> fsList(FsRequest request) {
        return extFileSystemMapper.fsList(request);
    }

    public List<FileSystem> allList() {
        return fileSystemMapper.selectByExample(null);
    }

    public List<FileSystem> allBindList(String sbomVersionId) {
        FileSystemExample example = new FileSystemExample();
        example.createCriteria().andSbomVersionIdEqualTo(sbomVersionId);
        return fileSystemMapper.selectByExample(example);
    }

    public List<FileSystem> unBindList() {
        return fileSystemMapper.selectByExample(null);
    }

    public FileSystem addFs(FileSystem fileSystem) throws Exception {
        String id = UUIDUtil.newUUID();
        fileSystem.setId(id);
        fileSystem.setCreator(SessionUtils.getUserId());
        fileSystem.setCreateTime(System.currentTimeMillis());
        fileSystem.setUpdateTime(System.currentTimeMillis());
        fileSystem.setStatus("VALID");

        OperationLogService.log(SessionUtils.getUser(), fileSystem.getId(), fileSystem.getName(), ResourceTypeConstants.FILE_SYSTEM.name(), ResourceOperation.CREATE, "i18n_create_fs");
        fileSystemMapper.insertSelective(fileSystem);
        return fileSystem;
    }

    public FileSystem updateFs(FileSystem fileSystem) throws Exception {
        fileSystem.setUpdateTime(System.currentTimeMillis());
        fileSystem.setStatus("VALID");

        OperationLogService.log(SessionUtils.getUser(), fileSystem.getId(), fileSystem.getName(), ResourceTypeConstants.FILE_SYSTEM.name(), ResourceOperation.UPDATE, "i18n_update_fs");
        fileSystemMapper.updateByPrimaryKeySelective(fileSystem);
        return fileSystem;
    }

    public void deleteFs(String id) throws Exception {
        fileSystemMapper.deleteByPrimaryKey(id);
        OperationLogService.log(SessionUtils.getUser(), id, id, ResourceTypeConstants.FILE_SYSTEM.name(), ResourceOperation.DELETE, "i18n_delete_fs");
    }

    public boolean validate(List<String> ids) {
        ids.forEach(id -> {
            try {
                boolean validate = validate(id);
                if(!validate) throw new HRException(Translator.get("failed_cloud_native"));
            } catch (Exception e) {
                LogUtil.error(e.getMessage());
                throw new HRException(e.getMessage());
            }
        });
        return true;
    }

    public boolean validate(String id) throws IOException, ApiException {
        FileSystem fileSystem = fileSystemMapper.selectByPrimaryKey(id);
        //检验账号的有效性
        boolean valid = true;
        if (valid) {
            fileSystem.setStatus(CloudAccountConstants.Status.VALID.name());
        } else {
            fileSystem.setStatus(CloudAccountConstants.Status.INVALID.name());
        }
        fileSystemMapper.updateByPrimaryKeySelective(fileSystem);
        return valid;
    }

    public List<FsRuleDTO> ruleList(FsRuleRequest request) {
        return extFileSystemRuleMapper.ruleList(request);
    }

    public int addFsRule(FsRuleRequest request) throws Exception {
        FileSystemRule record = new FileSystemRule();
        BeanUtils.copyBean(record, request);
        record.setId(UUIDUtil.newUUID());
        record.setLastModified(System.currentTimeMillis());
        saveRuleTagMapping(record.getId(), request.getTagKey());
        OperationLogService.log(SessionUtils.getUser(), record.getId(), record.getName(), ResourceTypeConstants.FILE_SYSTEM.name(), ResourceOperation.CREATE, "i18n_create_fs_rule");
        return fileSystemRuleMapper.insertSelective(record);
    }

    public void saveRuleTagMapping(String ruleId, String tagKey) {
        deleteRuleTag(null, ruleId);
        if (StringUtils.isNotEmpty(tagKey)) {
            RuleTagMapping sfRulesTagMapping = new RuleTagMapping();
            sfRulesTagMapping.setRuleId(ruleId);
            sfRulesTagMapping.setTagKey(tagKey);
            ruleTagMappingMapper.insert(sfRulesTagMapping);
        }
    }

    public void deleteRuleTag(String tagkey, String ruleId) {
        if (StringUtils.isNotBlank(tagkey)) {
            ruleTagMapper.deleteByPrimaryKey(tagkey);
            RuleTagExample ruleTagExample = new RuleTagExample();
            ruleTagExample.createCriteria().andTagKeyEqualTo(tagkey);
            ruleTagMapper.deleteByExample(ruleTagExample);
        }
        if (StringUtils.isNotBlank(ruleId)) {
            RuleTagMappingExample ruleTagMappingExample = new RuleTagMappingExample();
            ruleTagMappingExample.createCriteria().andRuleIdEqualTo(ruleId);
            ruleTagMappingMapper.deleteByExample(ruleTagMappingExample);
        }
    }

    public int updateFsRule(FsRuleRequest request) throws Exception {
        FileSystemRule record = new FileSystemRule();
        BeanUtils.copyBean(record, request);
        record.setLastModified(System.currentTimeMillis());
        saveRuleTagMapping(record.getId(), request.getTagKey());
        OperationLogService.log(SessionUtils.getUser(), record.getId(), record.getName(), ResourceTypeConstants.FILE_SYSTEM.name(), ResourceOperation.UPDATE, "i18n_update_fs_rule");
        return fileSystemRuleMapper.updateByPrimaryKeySelective(record);
    }

    public void deleteFsRule(String id) throws Exception {
        deleteRuleTag(null, id);
        fileSystemRuleMapper.deleteByPrimaryKey(id);
        OperationLogService.log(SessionUtils.getUser(), id, id, ResourceTypeConstants.FILE_SYSTEM.name(), ResourceOperation.DELETE, "i18n_delete_fs_rule");
    }

    public int changeStatus(FileSystemRule rule) throws Exception {
        return fileSystemRuleMapper.updateByPrimaryKeySelective(rule);
    }

    public List<FsResultDTO> resultList(FsResultRequest request) {
        List<FsResultDTO> list = extFileSystemResultMapper.resultList(request);
        return list;
    }

    public FsResultDTO getFsResult(String resultId) {
        FsResultDTO fsResult = extFileSystemResultMapper.getFsResult(resultId);
        return fsResult;
    }

    public List<FileSystemResultLog> getFsResultLog(String resultId) {
        FileSystemResultLogExample example = new FileSystemResultLogExample();
        example.createCriteria().andResultIdEqualTo(resultId);
        return fileSystemResultLogMapper.selectByExampleWithBLOBs(example);
    }

    public void deleteFsResult(String id) throws Exception {
        FileSystemResultLogExample logExample = new FileSystemResultLogExample();
        logExample.createCriteria().andResultIdEqualTo(id);
        fileSystemResultLogMapper.deleteByExample(logExample);
        fileSystemResultMapper.deleteByPrimaryKey(id);
    }

    public List<FileSystemResultItemWithBLOBs> resultItemList(FileSystemResultItem fileSystemResultItem) {
        FileSystemResultItemExample example = new FileSystemResultItemExample();
        example.createCriteria().andResultIdEqualTo(fileSystemResultItem.getResultId());
        example.setOrderByClause("FIELD(`severity`, 'CRITICAL', 'HIGH', 'MEDIUM', 'LOW', 'UNKNOWN')");
        return fileSystemResultItemMapper.selectByExampleWithBLOBs(example);
    }

    public void scan(String id) throws Exception {
        FileSystem fileSystem = fileSystemMapper.selectByPrimaryKey(id);
        Integer scanId = historyService.insertScanHistory(fileSystem);
        if(StringUtils.equalsIgnoreCase(fileSystem.getStatus(), CloudAccountConstants.Status.VALID.name())) {
            List<FsRuleDTO> ruleList = ruleList(null);
            FileSystemResult result = new FileSystemResult();

            deleteResultByFsId(id);

            for(FsRuleDTO dto : ruleList) {
                BeanUtils.copyBean(result, fileSystem);
                result.setId(UUIDUtil.newUUID());
                result.setFsId(id);
                result.setApplyUser(SessionUtils.getUserId());
                result.setCreateTime(System.currentTimeMillis());
                result.setUpdateTime(System.currentTimeMillis());
                result.setRuleId(dto.getId());
                result.setRuleName(dto.getName());
                result.setRuleDesc(dto.getDescription());
                result.setResultStatus(CloudTaskConstants.TASK_STATUS.APPROVED.toString());
                result.setSeverity(dto.getSeverity());
                result.setUserName(SessionUtils.getUser().getName());
                fileSystemResultMapper.insertSelective(result);

                saveFsResultLog(result.getId(), "i18n_start_fs_result", "", true);
                OperationLogService.log(SessionUtils.getUser(), result.getId(), result.getName(), ResourceTypeConstants.FILE_SYSTEM.name(), ResourceOperation.SCAN, "i18n_start_fs_result");

                historyService.insertScanTaskHistory(result, scanId, fileSystem.getId(), TaskEnum.fsAccount.getType());

                historyService.insertHistoryFileSystemResult(BeanUtils.copyBean(new HistoryFileSystemResult(), result));
            }
        }
    }

    public String reScan(String id) throws Exception {
        FileSystemResult result = fileSystemResultMapper.selectByPrimaryKey(id);

        result.setUpdateTime(System.currentTimeMillis());
        result.setResultStatus(CloudTaskConstants.TASK_STATUS.APPROVED.toString());
        result.setUserName(SessionUtils.getUser().getName());
        fileSystemResultMapper.updateByPrimaryKeySelective(result);

        reScanDeleteFileSystemResult(id);

        saveFsResultLog(result.getId(), "i18n_restart_fs_result", "", true);

        OperationLogService.log(SessionUtils.getUser(), result.getId(), result.getName(), ResourceTypeConstants.FILE_SYSTEM.name(), ResourceOperation.RESCAN, "i18n_restart_fs_result");

        historyService.updateHistoryFileSystemResult(BeanUtils.copyBean(new HistoryFileSystemResult(), result));

        return result.getId();
    }

    public void reScanDeleteFileSystemResult(String id) throws Exception {

        FileSystemResultItemExample example = new FileSystemResultItemExample();
        example.createCriteria().andResultIdEqualTo(id);
        fileSystemResultItemMapper.deleteByExample(example);

    }

    public void deleteResultByFsId(String id) throws Exception {
        FileSystemResultExample example = new FileSystemResultExample();
        example.createCriteria().andFsIdEqualTo(id);
        List<FileSystemResult> list = fileSystemResultMapper.selectByExample(example);

        for (FileSystemResult result : list) {
            FileSystemResultLogExample logExample = new FileSystemResultLogExample();
            logExample.createCriteria().andResultIdEqualTo(result.getId());
            fileSystemResultLogMapper.deleteByExample(logExample);

        }
        fileSystemResultMapper.deleteByExample(example);
    }

    void saveFsResultLog(String resultId, String operation, String output, boolean result) throws Exception {
        FileSystemResultLog log = new FileSystemResultLog();
        String operator = "system";
        try {
            if (SessionUtils.getUser() != null) {
                operator = SessionUtils.getUser().getId();
            }
        } catch (Exception e) {
            //防止单元测试无session
        }
        log.setOperator(operator);
        log.setResultId(resultId);
        log.setCreateTime(System.currentTimeMillis());
        log.setOperation(operation);
        log.setOutput(output);
        log.setResult(result);
        fileSystemResultLogMapper.insertSelective(log);

        historyService.insertHistoryFileSystemResultLog(BeanUtils.copyBean(new HistoryFileSystemResultLog(), log));
    }

    public void createScan (FileSystemResult result) throws Exception {
        try {
            FsRuleRequest request = new FsRuleRequest();
            request.setId(result.getRuleId());
            FsRuleDTO dto = ruleList(request).get(0);
            FileSystem fileSystem = fileSystemMapper.selectByPrimaryKey(result.getFsId());
            String script = dto.getScript();
            JSONArray jsonArray = JSON.parseArray(dto.getParameter());
            for (Object o : jsonArray) {
                JSONObject jsonObject = (JSONObject) o;
                String key = "${{" + jsonObject.getString("key") + "}}";
                if (script.contains(key)) {
                    script = script.replace(key, jsonObject.getString("defaultValue"));
                }
            }
            String returnJson = "";

            execute(fileSystem);
            returnJson = ReadFileUtils.readToBuffer(TrivyConstants.DEFAULT_BASE_DIR + TrivyConstants.TRIVY_JSON);
            result.setUpdateTime(System.currentTimeMillis());
            result.setReturnJson(returnJson);
            result.setResultStatus(CloudTaskConstants.TASK_STATUS.FINISHED.toString());

            long count = saveResultItem(result);
            result.setReturnSum(count);
            fileSystemResultMapper.updateByPrimaryKeySelective(result);

            noticeService.createFsMessageOrder(result);
            saveFsResultLog(result.getId(), "i18n_end_fs_result", "", true);

            historyService.updateHistoryFileSystemResult(BeanUtils.copyBean(new HistoryFileSystemResult(), result));
        } catch (Exception e) {
            LogUtil.error("create FileSystemResult: " + e.getMessage());
            result.setUpdateTime(System.currentTimeMillis());
            result.setResultStatus(CloudTaskConstants.TASK_STATUS.ERROR.toString());
            fileSystemResultMapper.updateByPrimaryKeySelective(result);
            historyService.updateHistoryFileSystemResult(BeanUtils.copyBean(new HistoryFileSystemResult(), result));
            saveFsResultLog(result.getId(), "i18n_operation_ex" + ": " + StringUtils.substring(e.getMessage(), 0, 900) + "...", e.getMessage(), false);
        }
    }

    public String execute(FileSystem fileSystem) throws Exception {
        Proxy proxy = new Proxy();
        if (fileSystem.getProxyId()!=null) {
            proxy = proxyMapper.selectByPrimaryKey(fileSystem.getProxyId());
        }
        IProvider cp = execEngineFactoryImp.getProvider("fsProvider");
        return (String) execEngineFactoryImp.executeMethod(cp, "execute", fileSystem, proxy);
    }

    long saveResultItem(FileSystemResult result) throws Exception {

        int i = 0;
        //插入returnJson
        JSONObject jsonG = JSONObject.parseObject(result.getReturnJson());
        if (jsonG != null) {
            JSONArray returnJson = JSONArray.parseArray(jsonG.getString("Results"));
            if(returnJson != null) {
                for (Object obj : returnJson) {
                    JSONObject jsonObject = (JSONObject) obj;
                    JSONArray vulnerabilities = JSONArray.parseArray(jsonObject.getString("Vulnerabilities"));
                    if(vulnerabilities == null) continue;
                    for (Object o : vulnerabilities) {
                        JSONObject resultObject = (JSONObject) o;
                        FileSystemResultItemWithBLOBs item = new FileSystemResultItemWithBLOBs();
                        item.setId(UUIDUtil.newUUID());
                        item.setResultId(result.getId());
                        item.setVulnerabilityId(resultObject.getString("VulnerabilityID"));
                        item.setPkgName(resultObject.getString("PkgName"));
                        item.setInstalledVersion(resultObject.getString("InstalledVersion"));
                        item.setFixedVersion(resultObject.getString("FixedVersion"));
                        item.setLayer(resultObject.getString("Layer"));
                        item.setSeveritySource(resultObject.getString("SeveritySource"));
                        item.setPrimaryUrl(resultObject.getString("PrimaryURL"));
                        item.setDataSource(resultObject.getString("DataSource"));
                        item.setTitle(resultObject.getString("Title"));
                        item.setDescription(resultObject.getString("Description"));
                        item.setSeverity(resultObject.getString("Severity"));
                        item.setCweIds(resultObject.getString("CweIDs"));
                        item.setCvss(resultObject.getString("CVSS"));
                        item.setReferences(resultObject.getString("References"));
                        item.setPublishedDate(resultObject.getString("PublishedDate"));
                        item.setLastModifiedDate(resultObject.getString("LastModifiedDate"));
                        fileSystemResultItemMapper.insertSelective(item);
                        i++;
                    }

                }
            }
        }

        return i;

    }

    public Map<String, Object> topInfo(Map<String, Object> params) {
        return extFileSystemMapper.topInfo(params);
    }

    public List<Map<String, Object>> projectChart() {
        return extFileSystemMapper.projectChart();
    }

    public List<Map<String, Object>> severityChart() {
        return extFileSystemMapper.severityChart();
    }

    public String download(Map<String, Object> map) {
        HistoryFileSystemResult result = historyFileSystemResultMapper.selectByPrimaryKey(map.get("id").toString());
        String str = result.getReturnJson();
        return str;
    }

    public List<HistoryFsResultDTO> history(Map<String, Object> params) {
        List<HistoryFsResultDTO> historyList = extFileSystemResultMapper.history(params);
        return historyList;
    }

    public void deleteHistoryFsResult(String id) throws Exception {
        HistoryFileSystemResultLogExample logExample = new HistoryFileSystemResultLogExample();
        logExample.createCriteria().andResultIdEqualTo(id);
        historyFileSystemResultLogMapper.deleteByExample(logExample);
        historyFileSystemResultMapper.deleteByPrimaryKey(id);
    }

    public List<FileSystemResultItemWithBLOBs> historyResultItemList(FileSystemResultItem item) {
        FileSystemResultItemExample example = new FileSystemResultItemExample();
        example.createCriteria().andResultIdEqualTo(item.getResultId());
        example.setOrderByClause("FIELD(`severity`, 'CRITICAL', 'HIGH', 'MEDIUM', 'LOW', 'UNKNOWN')");
        return fileSystemResultItemMapper.selectByExampleWithBLOBs(example);
    }

}