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
}
