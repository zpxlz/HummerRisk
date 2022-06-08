package io.hummerrisk.base.mapper;

import io.hummerrisk.base.domain.CloudAccountQuartzTaskRelaLog;
import io.hummerrisk.base.domain.CloudAccountQuartzTaskRelaLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CloudAccountQuartzTaskRelaLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_rela_log
     *
     * @mbg.generated Tue Jun 15 16:49:36 CST 2022
     */
    long countByExample(CloudAccountQuartzTaskRelaLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_rela_log
     *
     * @mbg.generated Tue Jun 15 16:49:36 CST 2022
     */
    int deleteByExample(CloudAccountQuartzTaskRelaLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_rela_log
     *
     * @mbg.generated Tue Jun 15 16:49:36 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_rela_log
     *
     * @mbg.generated Tue Jun 15 16:49:36 CST 2022
     */
    int insert(CloudAccountQuartzTaskRelaLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_rela_log
     *
     * @mbg.generated Tue Jun 15 16:49:36 CST 2022
     */
    int insertSelective(CloudAccountQuartzTaskRelaLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_rela_log
     *
     * @mbg.generated Tue Jun 15 16:49:36 CST 2022
     */
    List<CloudAccountQuartzTaskRelaLog> selectByExampleWithBLOBs(CloudAccountQuartzTaskRelaLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_rela_log
     *
     * @mbg.generated Tue Jun 15 16:49:36 CST 2022
     */
    List<CloudAccountQuartzTaskRelaLog> selectByExample(CloudAccountQuartzTaskRelaLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_rela_log
     *
     * @mbg.generated Tue Jun 15 16:49:36 CST 2022
     */
    CloudAccountQuartzTaskRelaLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_rela_log
     *
     * @mbg.generated Tue Jun 15 16:49:36 CST 2022
     */
    int updateByExampleSelective(@Param("record") CloudAccountQuartzTaskRelaLog record, @Param("example") CloudAccountQuartzTaskRelaLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_rela_log
     *
     * @mbg.generated Tue Jun 15 16:49:36 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") CloudAccountQuartzTaskRelaLog record, @Param("example") CloudAccountQuartzTaskRelaLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_rela_log
     *
     * @mbg.generated Tue Jun 15 16:49:36 CST 2022
     */
    int updateByExample(@Param("record") CloudAccountQuartzTaskRelaLog record, @Param("example") CloudAccountQuartzTaskRelaLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_rela_log
     *
     * @mbg.generated Tue Jun 15 16:49:36 CST 2022
     */
    int updateByPrimaryKeySelective(CloudAccountQuartzTaskRelaLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_rela_log
     *
     * @mbg.generated Tue Jun 15 16:49:36 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(CloudAccountQuartzTaskRelaLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_rela_log
     *
     * @mbg.generated Tue Jun 15 16:49:36 CST 2022
     */
    int updateByPrimaryKey(CloudAccountQuartzTaskRelaLog record);
}
