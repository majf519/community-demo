package com.recon.community.entity;

import java.util.Date;

public class ActivityRegistration {
    private String id;

    private String activityId;

    private String residentsId;

    private Date createTime;

    private Date updateTime;

    private String delFlag;

    public ActivityRegistration(String id, String activityId, String residentsId, Date createTime, Date updateTime, String delFlag) {
        this.id = id;
        this.activityId = activityId;
        this.residentsId = residentsId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.delFlag = delFlag;
    }

    public ActivityRegistration() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getResidentsId() {
        return residentsId;
    }

    public void setResidentsId(String residentsId) {
        this.residentsId = residentsId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}