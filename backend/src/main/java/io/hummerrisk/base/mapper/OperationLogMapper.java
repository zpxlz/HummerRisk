package io.hummerrisk.base.mapper;

import io.hummerrisk.base.domain.OperationLog;
import io.hummerrisk.base.domain.OperationLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OperationLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    long countByExample(OperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int deleteByExample(OperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int insert(OperationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int insertSelective(OperationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    List<OperationLog> selectByExampleWithBLOBs(OperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    List<OperationLog> selectByExample(OperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    OperationLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByExampleSelective(@Param("record") OperationLog record, @Param("example") OperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByExampleWithBLOBs(@Param("record") OperationLog record, @Param("example") OperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByExample(@Param("record") OperationLog record, @Param("example") OperationLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByPrimaryKeySelective(OperationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByPrimaryKeyWithBLOBs(OperationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByPrimaryKey(OperationLog record);
}
