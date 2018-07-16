package com.recon.community.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * @author daniel.xue
 * @create 2018/7/16
 **/
@TableName(value = "sys_operation")
public class Operation {

    @TableField(value = "id")
    private String id;

    @TableField(value = "user_id")
    private String userId;

    @TableField(value = "module")
    private String module;

    @TableField(value = "method")
    private String method;

    @TableField(value = "datetime")
    private Date datetime;

    @TableField(value = "del_flag")
    private String delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Operation() {
    }

    public Operation(String id, String userId, String module, String method, Date datetime, String delFlag) {
        this.id = id;
        this.userId = userId;
        this.module = module;
        this.method = method;
        this.datetime = datetime;
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", module='" + module + '\'' +
                ", method='" + method + '\'' +
                ", datetime=" + datetime +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}
