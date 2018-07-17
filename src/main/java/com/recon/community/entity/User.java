package com.recon.community.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * @author daniel.xue
 * @create 2018/7/16
 **/
@TableName(value = "sys_user")
public class User {

    @TableField(value = "id")
    private String id;

    @TableField(value = "username")
    private String username;

    @TableField(value = "password")
    private String password;

    @TableField(value = "token")
    private String token;

    @TableField(value = "user_type")
    private String userType;

    @TableField(value = "residents_id")
    private String residentsId;

    @TableField(value = "del_flag")
    private String delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getResidentsId() {
        return residentsId;
    }

    public void setResidentsId(String residentsId) {
        this.residentsId = residentsId;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                ", userType='" + userType + '\'' +
                ", residentsId='" + residentsId + '\'' +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}
