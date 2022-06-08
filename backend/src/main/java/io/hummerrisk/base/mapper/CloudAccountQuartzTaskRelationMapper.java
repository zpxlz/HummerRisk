package io.hummerrisk.base.mapper;

import io.hummerrisk.base.domain.CloudAccountQuartzTaskRelation;
import io.hummerrisk.base.domain.CloudAccountQuartzTaskRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CloudAccountQuartzTaskRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_relation
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    long countByExample(CloudAccountQuartzTaskRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_relation
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    int deleteByExample(CloudAccountQuartzTaskRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_relation
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_relation
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    int insert(CloudAccountQuartzTaskRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_relation
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    int insertSelective(CloudAccountQuartzTaskRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_relation
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    List<CloudAccountQuartzTaskRelation> selectByExampleWithBLOBs(CloudAccountQuartzTaskRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_relation
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    List<CloudAccountQuartzTaskRelation> selectByExample(CloudAccountQuartzTaskRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_relation
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    CloudAccountQuartzTaskRelation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_relation
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    int updateByExampleSelective(@Param("record") CloudAccountQuartzTaskRelation record, @Param("example") CloudAccountQuartzTaskRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_relation
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    int updateByExampleWithBLOBs(@Param("record") CloudAccountQuartzTaskRelation record, @Param("example") CloudAccountQuartzTaskRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_relation
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    int updateByExample(@Param("record") CloudAccountQuartzTaskRelation record, @Param("example") CloudAccountQuartzTaskRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_relation
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    int updateByPrimaryKeySelective(CloudAccountQuartzTaskRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_relation
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    int updateByPrimaryKeyWithBLOBs(CloudAccountQuartzTaskRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task_relation
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    int updateByPrimaryKey(CloudAccountQuartzTaskRelation record);
}
