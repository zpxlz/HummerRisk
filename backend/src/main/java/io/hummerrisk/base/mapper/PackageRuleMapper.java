package io.hummerrisk.base.mapper;

import io.hummerrisk.base.domain.PackageRule;
import io.hummerrisk.base.domain.PackageRuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PackageRuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_rule
     *
     * @mbg.generated Sun Jun 05 03:24:00 CST 2022
     */
    long countByExample(PackageRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_rule
     *
     * @mbg.generated Sun Jun 05 03:24:00 CST 2022
     */
    int deleteByExample(PackageRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_rule
     *
     * @mbg.generated Sun Jun 05 03:24:00 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_rule
     *
     * @mbg.generated Sun Jun 05 03:24:00 CST 2022
     */
    int insert(PackageRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_rule
     *
     * @mbg.generated Sun Jun 05 03:24:00 CST 2022
     */
    int insertSelective(PackageRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_rule
     *
     * @mbg.generated Sun Jun 05 03:24:00 CST 2022
     */
    List<PackageRule> selectByExampleWithBLOBs(PackageRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_rule
     *
     * @mbg.generated Sun Jun 05 03:24:00 CST 2022
     */
    List<PackageRule> selectByExample(PackageRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_rule
     *
     * @mbg.generated Sun Jun 05 03:24:00 CST 2022
     */
    PackageRule selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_rule
     *
     * @mbg.generated Sun Jun 05 03:24:00 CST 2022
     */
    int updateByExampleSelective(@Param("record") PackageRule record, @Param("example") PackageRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_rule
     *
     * @mbg.generated Sun Jun 05 03:24:00 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") PackageRule record, @Param("example") PackageRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_rule
     *
     * @mbg.generated Sun Jun 05 03:24:00 CST 2022
     */
    int updateByExample(@Param("record") PackageRule record, @Param("example") PackageRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_rule
     *
     * @mbg.generated Sun Jun 05 03:24:00 CST 2022
     */
    int updateByPrimaryKeySelective(PackageRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_rule
     *
     * @mbg.generated Sun Jun 05 03:24:00 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(PackageRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_rule
     *
     * @mbg.generated Sun Jun 05 03:24:00 CST 2022
     */
    int updateByPrimaryKey(PackageRule record);
}
