package com.recon.community.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
@ApiModel(value = "ActivitySaveStatusVO",description = "活动状态VO")
public class ActivitySaveStatusVO {

    @ApiModelProperty(value = "活动项目id")
    private String id;

    @ApiModelProperty(value = "活动状态 (0 草稿  1待处理 2 待审核 3审批中 4 已批准 5 已发布 6 已完成 )")
    private String saveStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSaveStatus() {
        return saveStatus;
    }

    public void setSaveStatus(String saveStatus) {
        this.saveStatus = saveStatus;
    }
}
