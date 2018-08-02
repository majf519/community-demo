package com.recon.community.entity;

import java.util.Date;

public class ActivityNews {
    private String id;

    private String activityId;

    private String title;

    private String type;

    private String content;

    private Date releaseTime;

    private String releaseUser;

    public ActivityNews(String id, String activityId, String title, String type, String content, Date releaseTime, String releaseUser) {
        this.id = id;
        this.activityId = activityId;
        this.title = title;
        this.type = type;
        this.content = content;
        this.releaseTime = releaseTime;
        this.releaseUser = releaseUser;
    }

    public ActivityNews() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getReleaseUser() {
        return releaseUser;
    }

    public void setReleaseUser(String releaseUser) {
        this.releaseUser = releaseUser;
    }
}