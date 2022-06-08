package io.hummerrisk.base.domain;

import java.io.Serializable;

public class TaskItemResourceWithBLOBs extends TaskItemResource implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_item_resource.resource_command
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private String resourceCommand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_item_resource.resource_command_action
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private String resourceCommandAction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_item_resource
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_item_resource.resource_command
     *
     * @return the value of task_item_resource.resource_command
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public String getResourceCommand() {
        return resourceCommand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_item_resource.resource_command
     *
     * @param resourceCommand the value for task_item_resource.resource_command
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public void setResourceCommand(String resourceCommand) {
        this.resourceCommand = resourceCommand == null ? null : resourceCommand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_item_resource.resource_command_action
     *
     * @return the value of task_item_resource.resource_command_action
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public String getResourceCommandAction() {
        return resourceCommandAction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_item_resource.resource_command_action
     *
     * @param resourceCommandAction the value for task_item_resource.resource_command_action
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    public void setResourceCommandAction(String resourceCommandAction) {
        this.resourceCommandAction = resourceCommandAction == null ? null : resourceCommandAction.trim();
    }
}
