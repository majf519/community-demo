package com.recon.community.entity;

import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;

public class Activity {
    private String id;

    private String name;

    private String form;

    private String administrativeLine;

    private String theme;

    private String themeCustomize;

    private String principal;

    private String beforeNotice;

    private String siteCoordination;

    private String materialPreparation;

    private String personContact;

    private String informationReport;

    private String schedule;

    private String saveStatus;

    private String address;

    private String scenePhoto;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    private String delFlag;



    public Activity(String id, String name, String form, String administrativeLine, String theme, String themeCustomize, String principal, String beforeNotice, String siteCoordination, String materialPreparation, String personContact, String informationReport, String schedule, String saveStatus, String address, String scenePhoto, Date createTime, String createUser, Date updateTime, String updateUser, String delFlag) {
        this.id = id;
        this.name = name;
        this.form = form;
        this.administrativeLine = administrativeLine;
        this.theme = theme;
        this.themeCustomize = themeCustomize;
        this.principal = principal;
        this.beforeNotice = beforeNotice;
        this.siteCoordination = siteCoordination;
        this.materialPreparation = materialPreparation;
        this.personContact = personContact;
        this.informationReport = informationReport;
        this.schedule = schedule;
        this.saveStatus = saveStatus;
        this.address = address;
        this.scenePhoto = scenePhoto;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.delFlag = delFlag;
    }

    public Activity() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getAdministrativeLine() {
        return administrativeLine;
    }

    public void setAdministrativeLine(String administrativeLine) {
        this.administrativeLine = administrativeLine;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getThemeCustomize() {
        return themeCustomize;
    }

    public void setThemeCustomize(String themeCustomize) {
        this.themeCustomize = themeCustomize;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getBeforeNotice() {
        return beforeNotice;
    }

    public void setBeforeNotice(String beforeNotice) {
        this.beforeNotice = beforeNotice;
    }

    public String getSiteCoordination() {
        return siteCoordination;
    }

    public void setSiteCoordination(String siteCoordination) {
        this.siteCoordination = siteCoordination;
    }

    public String getMaterialPreparation() {
        return materialPreparation;
    }

    public void setMaterialPreparation(String materialPreparation) {
        this.materialPreparation = materialPreparation;
    }

    public String getPersonContact() {
        return personContact;
    }

    public void setPersonContact(String personContact) {
        this.personContact = personContact;
    }

    public String getInformationReport() {
        return informationReport;
    }

    public void setInformationReport(String informationReport) {
        this.informationReport = informationReport;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSaveStatus() {
        return saveStatus;
    }

    public void setSaveStatus(String saveStatus) {
        this.saveStatus = saveStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getScenePhoto() {
        return scenePhoto;
    }

    public void setScenePhoto(String scenePhoto) {
        this.scenePhoto = scenePhoto;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
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