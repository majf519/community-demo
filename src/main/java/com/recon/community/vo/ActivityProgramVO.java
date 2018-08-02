package com.recon.community.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
@ApiModel(value = "ActivityProgramVO",description = "活动方案VO")
public class ActivityProgramVO {

    @ApiModelProperty(value = "活动项目id")
    private String activityId;

    @ApiModelProperty(value = "活动目的")
    private String purpose;

    @ApiModelProperty(value = "主办单位")
    private String motherboardUnit;

    @ApiModelProperty(value = "赞助单位")
    private String sponsor;

    @ApiModelProperty(value = "活动对象")
    private String activeObject;

    @ApiModelProperty(value = "活动时间")
    private Date activityTime;

    @ApiModelProperty(value = "活动地点")
    private String location;

    @ApiModelProperty(value = "活动内容")
    private String content;

    /**
     * 保存类型  0 为保存  1 为提交
     */
    @NotBlank
    @ApiModelProperty(value = "保存类型(0 为保存  1 提交) ")
    private String type;


    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getMotherboardUnit() {
        return motherboardUnit;
    }

    public void setMotherboardUnit(String motherboardUnit) {
        this.motherboardUnit = motherboardUnit;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getActiveObject() {
        return activeObject;
    }

    public void setActiveObject(String activeObject) {
        this.activeObject = activeObject;
    }

    public Date getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(Date activityTime) {
        this.activityTime = activityTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
