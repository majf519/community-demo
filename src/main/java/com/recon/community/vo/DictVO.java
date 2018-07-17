package com.recon.community.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author daniel.xue
 * @create 2018/7/9
 **/
@ApiModel(value = "dictVO",description = "字典vo")
@Data
public class DictVO implements Serializable{

    private static final long serialVersionUID = -5119373630007323026L;
    /**
     * 字典名称
     */
    @ApiModelProperty(value = "字典名称",required = true)
    @NotBlank
    private String dictValue;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述",required = false)
    private String remark;

    /**
     * 父类id
     */
    @ApiModelProperty(value = "父类id",required = true)
    @NotBlank
    private String parentId;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序",required = true)
    @NotNull
    private Integer sort;

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型",required = true)
    @NotBlank
    private String type;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DictVO{" +
                "dictValue='" + dictValue + '\'' +
                ", remark='" + remark + '\'' +
                ", parentId='" + parentId + '\'' +
                ", sort=" + sort +
                ", type='" + type + '\'' +
                '}';
    }
}
