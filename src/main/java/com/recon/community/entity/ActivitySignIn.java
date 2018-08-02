package com.recon.community.entity;

import java.util.Date;

public class ActivitySignIn {

    private String id;

    private String activityId;

    private String title;

    private String filePath;

    private String filename;

    private String description;

    private Date uploadTime;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    private String delFlag;

    public ActivitySignIn(String id, String activityId, String title, String filePath, String filename, String description, Date uploadTime, Date createTime, String createUser, Date updateTime, String updateUser, String delFlag) {
        this.id = id;
        this.activityId = activityId;
        this.title = title;
        this.filePath = filePath;
        this.filename = filename;
        this.description = description;
        this.uploadTime = uploadTime;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.delFlag = delFlag;
    }

    public ActivitySignIn() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
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

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}