package com.recon.community.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * @author daniel.xue
 * @create 2018/7/11
 **/
@TableName(value = "sys_dict")
public class Dict {

    @TableId
    private String id;

    @TableField(value = "type")
    private String type;

    @TableField(value = "dict_value")
    private String dictValue;

    @TableField(value = "parent_id")
    private String parentId;

    @TableField(value = "del_flag")
    private String delFlag;

    @TableField(value = "remark")
    private String remark;

    @TableField(value = "create_user")
    private String createUser;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "sort")
    private Integer sort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Dict() {
    }

    public Dict(String id, String type, String dictValue, String parentId, String delFlag, String remark, String createUser, Date createTime, Integer sort) {
        this.id = id;
        this.type = type;
        this.dictValue = dictValue;
        this.parentId = parentId;
        this.delFlag = delFlag;
        this.remark = remark;
        this.createUser = createUser;
        this.createTime = createTime;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Dict{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", dictValue='" + dictValue + '\'' +
                ", parentId='" + parentId + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", remark='" + remark + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createTime=" + createTime +
                ", sort=" + sort +
                '}';
    }
}
