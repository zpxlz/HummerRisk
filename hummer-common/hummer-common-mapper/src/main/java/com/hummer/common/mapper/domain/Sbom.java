package com.hummer.common.mapper.domain;

import java.io.Serializable;

public class Sbom implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sbom.id
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sbom.name
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sbom.description
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sbom.create_time
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sbom.update_time
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    private Long updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sbom.creator
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sbom
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sbom.id
     *
     * @return the value of sbom.id
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sbom.id
     *
     * @param id the value for sbom.id
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sbom.name
     *
     * @return the value of sbom.name
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sbom.name
     *
     * @param name the value for sbom.name
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sbom.description
     *
     * @return the value of sbom.description
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sbom.description
     *
     * @param description the value for sbom.description
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sbom.create_time
     *
     * @return the value of sbom.create_time
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sbom.create_time
     *
     * @param createTime the value for sbom.create_time
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sbom.update_time
     *
     * @return the value of sbom.update_time
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sbom.update_time
     *
     * @param updateTime the value for sbom.update_time
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sbom.creator
     *
     * @return the value of sbom.creator
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sbom.creator
     *
     * @param creator the value for sbom.creator
     *
     * @mbg.generated Tue Sep 20 12:32:20 CST 2022
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }
}