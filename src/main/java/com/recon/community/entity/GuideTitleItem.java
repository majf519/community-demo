package com.recon.community.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

@TableName(value = "community_guide_title_item")
public class GuideTitleItem {

    @TableId(value = "id")
    private String id;

    @TableField(value="guide_configuration_no")
    private String guideConfigurationNo;

    @TableField(value="title_name")
    private String titleName;

    @TableField(value="content")
    private String content;

    @TableField(value="sort_number")
    private String sortNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGuideConfigurationNo() {
        return guideConfigurationNo;
    }

    public void setGuideConfigurationNo(String guideConfigurationNo) {
        this.guideConfigurationNo = guideConfigurationNo;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(String sortNumber) {
        this.sortNumber = sortNumber;
    }
}
