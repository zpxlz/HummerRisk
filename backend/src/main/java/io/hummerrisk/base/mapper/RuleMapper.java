package io.hummerrisk.base.mapper;

import io.hummerrisk.base.domain.Rule;
import io.hummerrisk.base.domain.RuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    long countByExample(RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int deleteByExample(RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int insert(Rule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int insertSelective(Rule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    List<Rule> selectByExample(RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    Rule selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int updateByExampleSelective(@Param("record") Rule record, @Param("example") RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int updateByExample(@Param("record") Rule record, @Param("example") RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int updateByPrimaryKeySelective(Rule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    int updateByPrimaryKey(Rule record);
}
