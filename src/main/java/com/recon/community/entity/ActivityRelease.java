package com.recon.community.entity;

import java.util.Date;

public class ActivityRelease {
    private String id;

    private String activityId;

    private Date registrationDeadline;

    private String activityPropaganda;

    private String createUser;

    private Date createTime;

    public ActivityRelease(String id, String activityId, Date registrationDeadline, String activityPropaganda, String createUser, Date createTime) {
        this.id = id;
        this.activityId = activityId;
        this.registrationDeadline = registrationDeadline;
        this.activityPropaganda = activityPropaganda;
        this.createUser = createUser;
        this.createTime = createTime;
    }

    public ActivityRelease() {
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