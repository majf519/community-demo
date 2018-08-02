package com.recon.community.entity;

import java.util.Date;

public class ActivityRecording {
    private String id;

    private String activityId;

    private String participateNumber;

    private String recording;

    private String createUser;

    private Date createTime;

    public ActivityRecording(String id, String activityId, String participateNumber, String recording, String createUser, Date createTime) {
        this.id = id;
        this.activityId = activityId;
        this.participateNumber = participateNumber;
        this.recording = recording;
        this.createUser = createUser;
        this.createTime = createTime;
    }

    public ActivityRecording() {
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

    public String getParticipateNumber() {
        return participateNumber;
    }

    public void setParticipateNumber(String participateNumber) {
        this.participateNumber = participateNumber;
    }

    public String getRecording() {
        return recording;
    }

    public void setRecording(String recording) {
        this.recording = recording;
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
}