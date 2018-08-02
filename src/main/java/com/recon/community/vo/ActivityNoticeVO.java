package com.recon.community.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
@ApiModel(value = "ActivityNoticeVO",description = "通知对象VO")
public class ActivityNoticeVO {

    @ApiModelProperty(value = "发送人")
    private String senderId;

    @ApiModelProperty(value = "通知内容")
    private String content;

    @ApiModelProperty(value = "被通知人( 多个用逗号拼接)")
    private String receiveList;

    @ApiModelProperty(value = "活动id")
    private String activityId;

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReceiveList() {
        return receiveList;
    }

    public void setReceiveList(String receiveList) {
        this.receiveList = receiveList;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
}
