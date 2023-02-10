package com.hummer.common.core.mapper;

import com.hummer.common.core.domain.CloudAccountQuartzTask;
import com.hummer.common.core.domain.CloudAccountQuartzTaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CloudAccountQuartzTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2022
     */
    long countByExample(CloudAccountQuartzTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2022
     */
    int deleteByExample(CloudAccountQuartzTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2022
     */
    int insert(CloudAccountQuartzTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2022
     */
    int insertSelective(CloudAccountQuartzTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2022
     */
    List<CloudAccountQuartzTask> selectByExample(CloudAccountQuartzTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2022
     */
    CloudAccountQuartzTask selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2022
     */
    int updateByExampleSelective(@Param("record") CloudAccountQuartzTask record, @Param("example") CloudAccountQuartzTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2022
     */
    int updateByExample(@Param("record") CloudAccountQuartzTask record, @Param("example") CloudAccountQuartzTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2022
     */
    int updateByPrimaryKeySelective(CloudAccountQuartzTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_account_quartz_task
     *
     * @mbg.generated Tue Jun 15 10:42:15 CST 2022
     */
    int updateByPrimaryKey(CloudAccountQuartzTask record);
}