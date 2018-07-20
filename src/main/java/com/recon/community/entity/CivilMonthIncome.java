package com.recon.community.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CivilMonthIncome {
    private String id;

    private String residentId;

    private String incomeCategory;

    private BigDecimal money;

    private BigDecimal noMoney;

    private BigDecimal reckonInMoney;

    private BigDecimal realMoney;

    private String createUser;

    private Date createTime;

    private String upateUser;

    private Date updateTime;

    private String delFlag;

    public CivilMonthIncome(String id, String residentId, String incomeCategory, BigDecimal money, BigDecimal noMoney, BigDecimal reckonInMoney, BigDecimal realMoney, String createUser, Date createTime, String upateUser, Date updateTime, String delFlag) {
        this.id = id;
        this.residentId = residentId;
        this.incomeCategory = incomeCategory;
        this.money = money;
        this.noMoney = noMoney;
        this.reckonInMoney = reckonInMoney;
        this.realMoney = realMoney;
        this.createUser = createUser;
        this.createTime = createTime;
        this.upateUser = upateUser;
        this.updateTime = updateTime;
        this.delFlag = delFlag;
    }

    public CivilMonthIncome() {
        super();
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

    public String getIncomeCategory() {
        return incomeCategory;
    }

    public void setIncomeCategory(String incomeCategory) {
        this.incomeCategory = incomeCategory;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getNoMoney() {
        return noMoney;
    }

    public void setNoMoney(BigDecimal noMoney) {
        this.noMoney = noMoney;
    }

    public BigDecimal getReckonInMoney() {
        return reckonInMoney;
    }

    public void setReckonInMoney(BigDecimal reckonInMoney) {
        this.reckonInMoney = reckonInMoney;
    }

    public BigDecimal getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(BigDecimal realMoney) {
        this.realMoney = realMoney;
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

    public String getUpateUser() {
        return upateUser;
    }

    public void setUpateUser(String upateUser) {
        this.upateUser = upateUser;
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