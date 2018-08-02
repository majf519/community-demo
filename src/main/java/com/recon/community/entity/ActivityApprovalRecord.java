package com.recon.community.entity;

import java.util.Date;

public class ActivityApprovalRecord {
    private String id;

    private String acitivityId;

    private String sender;

    private String senderRole;

    private String receiver;

    private String type;

    private String result;

    private Date processingTime;

    private String remark;

    public ActivityApprovalRecord(String id, String acitivityId, String sender, String senderRole, String receiver, String type, String result, Date processingTime, String remark) {
        this.id = id;
        this.acitivityId = acitivityId;
        this.sender = sender;
        this.senderRole = senderRole;
        this.receiver = receiver;
        this.type = type;
        this.result = result;
        this.processingTime = processingTime;
        this.remark = remark;
    }

    public ActivityApprovalRecord() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAcitivityId() {
        return acitivityId;
    }

    public void setAcitivityId(String acitivityId) {
        this.acitivityId = acitivityId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderRole() {
        return senderRole;
    }

    public void setSenderRole(String senderRole) {
        this.senderRole = senderRole;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Date getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(Date processingTime) {
        this.processingTime = processingTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}