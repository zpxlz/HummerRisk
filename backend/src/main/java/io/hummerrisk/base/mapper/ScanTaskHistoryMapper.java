package io.hummerrisk.base.mapper;

import io.hummerrisk.base.domain.ScanTaskHistory;
import io.hummerrisk.base.domain.ScanTaskHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScanTaskHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_task_history
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    long countByExample(ScanTaskHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_task_history
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int deleteByExample(ScanTaskHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_task_history
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_task_history
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int insert(ScanTaskHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_task_history
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int insertSelective(ScanTaskHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_task_history
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    List<ScanTaskHistory> selectByExampleWithBLOBs(ScanTaskHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_task_history
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    List<ScanTaskHistory> selectByExample(ScanTaskHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_task_history
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    ScanTaskHistory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_task_history
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByExampleSelective(@Param("record") ScanTaskHistory record, @Param("example") ScanTaskHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_task_history
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByExampleWithBLOBs(@Param("record") ScanTaskHistory record, @Param("example") ScanTaskHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_task_history
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByExample(@Param("record") ScanTaskHistory record, @Param("example") ScanTaskHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_task_history
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByPrimaryKeySelective(ScanTaskHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_task_history
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByPrimaryKeyWithBLOBs(ScanTaskHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_task_history
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByPrimaryKey(ScanTaskHistory record);
}
