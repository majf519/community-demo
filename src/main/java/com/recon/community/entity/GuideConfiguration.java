package com.recon.community.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;
import java.util.List;

@TableName(value = "community_guide_configuration")
public class GuideConfiguration {

    @TableId(value = "id")
    private String id;

    @TableField(value = "business_name")
    private String businessName;

    @TableField(value = "guide_template_no")
    private String guideTemplateNo;

    @TableField(value = "business_type")
    private String businessType;

    @TableField(value = "terminal_type")
    private String terminalType;

    @TableField(value = "is_online_apply")
    private String isOnlineApply;

    @TableField(value = "start_time")
    private Date startTime;

    @TableField(value = "enabled")
    private String enabled;

    @TableField(value = "del_flag")
    private String delFlag;

    @TableField(value = "create_user")
    private String createUser;

    @TableField(value = "createTime")
    private Date createTime;

    @TableField(value = "update_user")
    private String updateUser;

    @TableField(value = "update_time")
    private String updateTime;

    private List<GuideTitleItem> guideTitleItemList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getGuideTemplateNo() {
        return guideTemplateNo;
    }

    public void setGuideTemplateNo(String guideTemplateNo) {
        this.guideTemplateNo = guideTemplateNo;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getIsOnlineApply() {
        return isOnlineApply;
    }

    public void setIsOnlineApply(String isOnlineApply) {
        this.isOnlineApply = isOnlineApply;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
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

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public List<GuideTitleItem> getGuideTitleItemList() {
        return guideTitleItemList;
    }

    public void setGuideTitleItemList(List<GuideTitleItem> guideTitleItemList) {
        this.guideTitleItemList = guideTitleItemList;
    }
}
