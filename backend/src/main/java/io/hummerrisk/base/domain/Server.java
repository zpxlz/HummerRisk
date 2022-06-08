package io.hummerrisk.base.domain;

import java.io.Serializable;

public class Server implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server.id
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server.name
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server.server_group_id
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    private String serverGroupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server.plugin_icon
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    private String pluginIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server.status
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server.create_time
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server.update_time
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    private Long updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server.creator
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server.ip
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server.port
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    private String port;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server.user_name
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server.password
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table server
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server.id
     *
     * @return the value of server.id
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server.id
     *
     * @param id the value for server.id
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server.name
     *
     * @return the value of server.name
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server.name
     *
     * @param name the value for server.name
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server.server_group_id
     *
     * @return the value of server.server_group_id
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server.server_group_id
     *
     * @param serverGroupId the value for server.server_group_id
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId == null ? null : serverGroupId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server.plugin_icon
     *
     * @return the value of server.plugin_icon
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public String getPluginIcon() {
        return pluginIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server.plugin_icon
     *
     * @param pluginIcon the value for server.plugin_icon
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public void setPluginIcon(String pluginIcon) {
        this.pluginIcon = pluginIcon == null ? null : pluginIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server.status
     *
     * @return the value of server.status
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server.status
     *
     * @param status the value for server.status
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server.create_time
     *
     * @return the value of server.create_time
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server.create_time
     *
     * @param createTime the value for server.create_time
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server.update_time
     *
     * @return the value of server.update_time
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server.update_time
     *
     * @param updateTime the value for server.update_time
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server.creator
     *
     * @return the value of server.creator
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server.creator
     *
     * @param creator the value for server.creator
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server.ip
     *
     * @return the value of server.ip
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server.ip
     *
     * @param ip the value for server.ip
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server.port
     *
     * @return the value of server.port
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public String getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server.port
     *
     * @param port the value for server.port
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server.user_name
     *
     * @return the value of server.user_name
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server.user_name
     *
     * @param userName the value for server.user_name
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server.password
     *
     * @return the value of server.password
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server.password
     *
     * @param password the value for server.password
     *
     * @mbg.generated Wed May 25 23:44:34 CST 2022
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}
