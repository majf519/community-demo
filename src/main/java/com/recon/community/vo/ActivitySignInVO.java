package com.recon.community.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
@ApiModel(value = "ActivitySignInVO",description = "活动签到信息VO")
public class ActivitySignInVO {

    @ApiModelProperty(value = "活动id")
    private String activityId;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "文件上传路径")
    private String filePath;

    @ApiModelProperty(value = "文件名称")
    private String filename;

    @ApiModelProperty(value = "描述")
    private String description;

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

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
