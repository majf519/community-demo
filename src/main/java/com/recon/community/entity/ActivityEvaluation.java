package com.recon.community.entity;

import java.util.Date;

public class ActivityEvaluation {
    private String id;

    private String activityId;

    private String score;

    private String opinion;

    private String createUser;

    private Date createTime;

    public ActivityEvaluation(String id, String activityId, String score, String opinion, String createUser, Date createTime) {
        this.id = id;
        this.activityId = activityId;
        this.score = score;
        this.opinion = opinion;
        this.createUser = createUser;
        this.createTime = createTime;
    }

    public ActivityEvaluation() {
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

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
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