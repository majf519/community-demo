package com.recon.community.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author daniel.xue
 * @create 2018/7/28
 **/
@ApiModel(value = "ApplyStatusVO",description = "审核VO")
public class ApplyStatusVO {

    @ApiModelProperty(value = "审核项目id")
    private String id;

    @ApiModelProperty(value = "审核状态 (0  同意  1 拒绝 )")
    private String status;

    @ApiModelProperty(value = "审核拒绝原因")
    private String reason;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "ApplyStatusVO{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
