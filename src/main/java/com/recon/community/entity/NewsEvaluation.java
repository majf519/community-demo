package com.recon.community.entity;

import java.util.Date;

public class NewsEvaluation {
    private String id;

    private String newsId;

    private String evaluationUser;

    private String evaluationContent;

    private Date evaluationTime;

    private String parentId;

    private Date updateTime;

    private String updateUser;

    private String delFlag;

    public NewsEvaluation(String id, String newsId, String evaluationUser, String evaluationContent, Date evaluationTime, String parentId, Date updateTime, String updateUser, String delFlag) {
        this.id = id;
        this.newsId = newsId;
        this.evaluationUser = evaluationUser;
        this.evaluationContent = evaluationContent;
        this.evaluationTime = evaluationTime;
        this.parentId = parentId;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.delFlag = delFlag;
    }

    public NewsEvaluation() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getEvaluationUser() {
        return evaluationUser;
    }

    public void setEvaluationUser(String evaluationUser) {
        this.evaluationUser = evaluationUser;
    }

    public String getEvaluationContent() {
        return evaluationContent;
    }

    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent;
    }

    public Date getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
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