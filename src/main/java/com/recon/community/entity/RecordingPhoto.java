package com.recon.community.entity;

import java.util.Date;

public class RecordingPhoto {
    private String id;

    private String activityId;

    private String filename;

    private String description;

    private Date uploadTime;

    private String filePath;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private String delFlag;

    public RecordingPhoto(String id, String activityId, String filename, String description, Date uploadTime, String filePath, String createUser, Date createTime, String updateUser, Date updateTime, String delFlag) {
        this.id = id;
        this.activityId = activityId;
        this.filename = filename;
        this.description = description;
        this.uploadTime = uploadTime;
        this.filePath = filePath;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
        this.delFlag = delFlag;
    }

    public RecordingPhoto() {
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

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
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