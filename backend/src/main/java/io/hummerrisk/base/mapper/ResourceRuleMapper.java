package io.hummerrisk.base.mapper;

import io.hummerrisk.base.domain.ResourceRule;
import io.hummerrisk.base.domain.ResourceRuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResourceRuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    long countByExample(ResourceRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int deleteByExample(ResourceRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int deleteByPrimaryKey(String resourceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int insert(ResourceRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int insertSelective(ResourceRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    List<ResourceRule> selectByExample(ResourceRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    ResourceRule selectByPrimaryKey(String resourceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int updateByExampleSelective(@Param("record") ResourceRule record, @Param("example") ResourceRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int updateByExample(@Param("record") ResourceRule record, @Param("example") ResourceRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int updateByPrimaryKeySelective(ResourceRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int updateByPrimaryKey(ResourceRule record);
}
