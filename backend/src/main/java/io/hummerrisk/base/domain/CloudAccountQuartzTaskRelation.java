package io.hummerrisk.base.domain;

import java.io.Serializable;

public class CloudAccountQuartzTaskRelation implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account_quartz_task_relation.id
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account_quartz_task_relation.quartz_task_id
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    private String quartzTaskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account_quartz_task_relation.source_id
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    private String sourceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account_quartz_task_relation.create_time
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account_quartz_task_relation.qz_type
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    private String qzType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account_quartz_task_relation.task_ids
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    private String taskIds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_account_quartz_task_relation
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account_quartz_task_relation.id
     *
     * @return the value of cloud_account_quartz_task_relation.id
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account_quartz_task_relation.id
     *
     * @param id the value for cloud_account_quartz_task_relation.id
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account_quartz_task_relation.quartz_task_id
     *
     * @return the value of cloud_account_quartz_task_relation.quartz_task_id
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    public String getQuartzTaskId() {
        return quartzTaskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account_quartz_task_relation.quartz_task_id
     *
     * @param quartzTaskId the value for cloud_account_quartz_task_relation.quartz_task_id
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    public void setQuartzTaskId(String quartzTaskId) {
        this.quartzTaskId = quartzTaskId == null ? null : quartzTaskId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account_quartz_task_relation.source_id
     *
     * @return the value of cloud_account_quartz_task_relation.source_id
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account_quartz_task_relation.source_id
     *
     * @param sourceId the value for cloud_account_quartz_task_relation.source_id
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account_quartz_task_relation.create_time
     *
     * @return the value of cloud_account_quartz_task_relation.create_time
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account_quartz_task_relation.create_time
     *
     * @param createTime the value for cloud_account_quartz_task_relation.create_time
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account_quartz_task_relation.qz_type
     *
     * @return the value of cloud_account_quartz_task_relation.qz_type
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    public String getQzType() {
        return qzType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account_quartz_task_relation.qz_type
     *
     * @param qzType the value for cloud_account_quartz_task_relation.qz_type
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    public void setQzType(String qzType) {
        this.qzType = qzType == null ? null : qzType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account_quartz_task_relation.task_ids
     *
     * @return the value of cloud_account_quartz_task_relation.task_ids
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    public String getTaskIds() {
        return taskIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account_quartz_task_relation.task_ids
     *
     * @param taskIds the value for cloud_account_quartz_task_relation.task_ids
     *
     * @mbg.generated Fri Jun 11 15:33:36 CST 2021
     */
    public void setTaskIds(String taskIds) {
        this.taskIds = taskIds == null ? null : taskIds.trim();
    }
}
