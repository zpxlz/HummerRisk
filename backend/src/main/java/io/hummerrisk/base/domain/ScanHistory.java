package io.hummerrisk.base.domain;

import java.io.Serializable;

public class ScanHistory implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_history.id
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_history.account_id
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_history.create_time
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_history.operator
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_history.resources_sum
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    private Long resourcesSum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_history.return_sum
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    private Long returnSum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_history.scan_score
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    private Integer scanScore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column scan_history.output
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    private String output;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table scan_history
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_history.id
     *
     * @return the value of scan_history.id
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_history.id
     *
     * @param id the value for scan_history.id
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_history.account_id
     *
     * @return the value of scan_history.account_id
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_history.account_id
     *
     * @param accountId the value for scan_history.account_id
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_history.create_time
     *
     * @return the value of scan_history.create_time
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_history.create_time
     *
     * @param createTime the value for scan_history.create_time
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_history.operator
     *
     * @return the value of scan_history.operator
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_history.operator
     *
     * @param operator the value for scan_history.operator
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_history.resources_sum
     *
     * @return the value of scan_history.resources_sum
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    public Long getResourcesSum() {
        return resourcesSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_history.resources_sum
     *
     * @param resourcesSum the value for scan_history.resources_sum
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    public void setResourcesSum(Long resourcesSum) {
        this.resourcesSum = resourcesSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_history.return_sum
     *
     * @return the value of scan_history.return_sum
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    public Long getReturnSum() {
        return returnSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_history.return_sum
     *
     * @param returnSum the value for scan_history.return_sum
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    public void setReturnSum(Long returnSum) {
        this.returnSum = returnSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_history.scan_score
     *
     * @return the value of scan_history.scan_score
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    public Integer getScanScore() {
        return scanScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_history.scan_score
     *
     * @param scanScore the value for scan_history.scan_score
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    public void setScanScore(Integer scanScore) {
        this.scanScore = scanScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column scan_history.output
     *
     * @return the value of scan_history.output
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    public String getOutput() {
        return output;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column scan_history.output
     *
     * @param output the value for scan_history.output
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    public void setOutput(String output) {
        this.output = output == null ? null : output.trim();
    }
}
