package com.recon.community.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
@ApiModel(value = "ActivityReleaseVO",description = "活动发布VO")
public class ActivityReleaseVO {

    @ApiModelProperty(value = "活动项目id")
    private String activityId;

    @ApiModelProperty(value = "活动截止时间")
    private Date registrationDeadline;

    @ApiModelProperty(value = "活动宣传内容")
    private String activityPropaganda;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public Date getRegistrationDeadline() {
        return registrationDeadline;
    }

    public void setRegistrationDeadline(Date registrationDeadline) {
        this.registrationDeadline = registrationDeadline;
    }

    public String getActivityPropaganda() {
        return activityPropaganda;
    }

    public void setActivityPropaganda(String activityPropaganda) {
        this.activityPropaganda = activityPropaganda;
    }
}
