package com.recon.community.entity;

import java.util.Date;

public class ActivityProgram {
    private String id;

    private String activityId;

    private String purpose;

    private String motherboardUnit;

    private String sponsor;

    private String activeObject;

    private Date activityTime;

    private String location;

    private String content;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    public ActivityProgram(String id, String activityId, String purpose, String motherboardUnit, String sponsor, String activeObject, Date activityTime, String location, String content, Date createTime, String createUser, Date updateTime, String updateUser) {
        this.id = id;
        this.activityId = activityId;
        this.purpose = purpose;
        this.motherboardUnit = motherboardUnit;
        this.sponsor = sponsor;
        this.activeObject = activeObject;
        this.activityTime = activityTime;
        this.location = location;
        this.content = content;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
    }

    public ActivityProgram() {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}