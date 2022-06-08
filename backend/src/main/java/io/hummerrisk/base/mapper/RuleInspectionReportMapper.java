package io.hummerrisk.base.mapper;

import io.hummerrisk.base.domain.RuleInspectionReport;
import io.hummerrisk.base.domain.RuleInspectionReportExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RuleInspectionReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    long countByExample(RuleInspectionReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int deleteByExample(RuleInspectionReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int insert(RuleInspectionReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int insertSelective(RuleInspectionReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    List<RuleInspectionReport> selectByExample(RuleInspectionReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    RuleInspectionReport selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int updateByExampleSelective(@Param("record") RuleInspectionReport record, @Param("example") RuleInspectionReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int updateByExample(@Param("record") RuleInspectionReport record, @Param("example") RuleInspectionReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int updateByPrimaryKeySelective(RuleInspectionReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int updateByPrimaryKey(RuleInspectionReport record);
}
