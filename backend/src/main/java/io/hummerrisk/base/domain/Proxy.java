package io.hummerrisk.base.domain;

import java.io.Serializable;

public class Proxy implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proxy.id
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proxy.proxy_type
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    private String proxyType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proxy.proxy_ip
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    private String proxyIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proxy.proxy_port
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    private String proxyPort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proxy.proxy_name
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    private String proxyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proxy.proxy_password
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    private String proxyPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proxy.create_time
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proxy.update_time
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    private Long updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table proxy
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proxy.id
     *
     * @return the value of proxy.id
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proxy.id
     *
     * @param id the value for proxy.id
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proxy.proxy_type
     *
     * @return the value of proxy.proxy_type
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    public String getProxyType() {
        return proxyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proxy.proxy_type
     *
     * @param proxyType the value for proxy.proxy_type
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    public void setProxyType(String proxyType) {
        this.proxyType = proxyType == null ? null : proxyType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proxy.proxy_ip
     *
     * @return the value of proxy.proxy_ip
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    public String getProxyIp() {
        return proxyIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proxy.proxy_ip
     *
     * @param proxyIp the value for proxy.proxy_ip
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    public void setProxyIp(String proxyIp) {
        this.proxyIp = proxyIp == null ? null : proxyIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proxy.proxy_port
     *
     * @return the value of proxy.proxy_port
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    public String getProxyPort() {
        return proxyPort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proxy.proxy_port
     *
     * @param proxyPort the value for proxy.proxy_port
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    public void setProxyPort(String proxyPort) {
        this.proxyPort = proxyPort == null ? null : proxyPort.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proxy.proxy_name
     *
     * @return the value of proxy.proxy_name
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    public String getProxyName() {
        return proxyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proxy.proxy_name
     *
     * @param proxyName the value for proxy.proxy_name
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    public void setProxyName(String proxyName) {
        this.proxyName = proxyName == null ? null : proxyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proxy.proxy_password
     *
     * @return the value of proxy.proxy_password
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    public String getProxyPassword() {
        return proxyPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proxy.proxy_password
     *
     * @param proxyPassword the value for proxy.proxy_password
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword == null ? null : proxyPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proxy.create_time
     *
     * @return the value of proxy.create_time
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proxy.create_time
     *
     * @param createTime the value for proxy.create_time
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proxy.update_time
     *
     * @return the value of proxy.update_time
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proxy.update_time
     *
     * @param updateTime the value for proxy.update_time
     *
     * @mbg.generated Fri Apr 09 11:29:36 CST 2022
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
