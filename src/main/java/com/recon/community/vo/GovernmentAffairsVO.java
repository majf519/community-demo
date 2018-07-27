package com.recon.community.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class GovernmentAffairsVO {

    @ApiModelProperty(value = "业务名称",required = true)
    private String businessName;

    private String businessType;

    private String businessStatus;

    private String id;

    private String residentId;

    private String name;

    private Date withdrawalTime;

    private Date expropriationTime;

    private String expropriationUnit;

    private String unemploymentTime;

    private String remediesType;

    private String reliefReason;

    private String createUnit;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private String delFlag;

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getWithdrawalTime() {
        return withdrawalTime;
    }

    public void setWithdrawalTime(Date withdrawalTime) {
        this.withdrawalTime = withdrawalTime;
    }

    public Date getExpropriationTime() {
        return expropriationTime;
    }

    public void setExpropriationTime(Date expropriationTime) {
        this.expropriationTime = expropriationTime;
    }

    public String getExpropriationUnit() {
        return expropriationUnit;
    }

    public void setExpropriationUnit(String expropriationUnit) {
        this.expropriationUnit = expropriationUnit;
    }

    public String getUnemploymentTime() {
        return unemploymentTime;
    }

    public void setUnemploymentTime(String unemploymentTime) {
        this.unemploymentTime = unemploymentTime;
    }

    public String getRemediesType() {
        return remediesType;
    }

    public void setRemediesType(String remediesType) {
        this.remediesType = remediesType;
    }

    public String getReliefReason() {
        return reliefReason;
    }

    public void setReliefReason(String reliefReason) {
        this.reliefReason = reliefReason;
    }

    public String getCreateUnit() {
        return createUnit;
    }

    public void setCreateUnit(String createUnit) {
        this.createUnit = createUnit;
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
