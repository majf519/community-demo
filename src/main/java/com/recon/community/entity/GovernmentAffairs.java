package com.recon.community.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.Date;

@TableName(value = "civil_alms_apply")
public class GovernmentAffairs {

    @TableId(value = "id")
    private String id;

    @TableField(value="resident_id")
    private String residentId;

    @TableField(value="withdrawal_time")
    private Date withdrawalTime;

    @TableField(value="expropriation_time")
    private Date expropriationTime;

    @TableField(value="expropriation_unit")
    private String expropriationUnit;

    @TableField(value="unemployment_time")
    private Date unemploymentTime;

    @TableField(value="remedies_type")
    private String remediesType;

    @TableField(value="relief_reason")
    private String reliefReason;

    @TableField(value="status")
    private String status;

    @TableField(value="create_unit")
    private String createUnit;

    @TableField(value="create_user")
    private String createUser;

    @TableField(value="create_time")
    private Date createTime;

    @TableField(value="update_user")
    private String updateUser;

    @TableField(value="update_time")
    private Date updateTime;

    @TableField(value="del_flag")
    private String delFlag;

    @TableField(exist = false)
    private String name;

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

    public Date getUnemploymentTime() {
        return unemploymentTime;
    }

    public void setUnemploymentTime(Date unemploymentTime) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
