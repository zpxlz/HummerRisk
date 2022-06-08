package io.hummerrisk.base.mapper;

import io.hummerrisk.base.domain.MessageOrderItem;
import io.hummerrisk.base.domain.MessageOrderItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageOrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2022
     */
    long countByExample(MessageOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2022
     */
    int deleteByExample(MessageOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2022
     */
    int insert(MessageOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2022
     */
    int insertSelective(MessageOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2022
     */
    List<MessageOrderItem> selectByExample(MessageOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2022
     */
    MessageOrderItem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2022
     */
    int updateByExampleSelective(@Param("record") MessageOrderItem record, @Param("example") MessageOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2022
     */
    int updateByExample(@Param("record") MessageOrderItem record, @Param("example") MessageOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2022
     */
    int updateByPrimaryKeySelective(MessageOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_order_item
     *
     * @mbg.generated Thu Mar 11 14:08:10 CST 2022
     */
    int updateByPrimaryKey(MessageOrderItem record);
}
