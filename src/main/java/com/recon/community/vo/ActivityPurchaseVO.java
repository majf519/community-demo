package com.recon.community.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
@ApiModel(value = "ActivityPurchaseVO",description = "采购物品VO")
public class ActivityPurchaseVO {

    @ApiModelProperty(value = "项目活动id")
    private String activityId;

    @ApiModelProperty(value = "物品名称")
    private String name;

    @ApiModelProperty(value = "物品来源")
    private String source;

    @ApiModelProperty(value = "规则")
    private String specification;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "单价")
    private String price;

    @ApiModelProperty(value = "数量")
    private String number;

    @ApiModelProperty(value = "总价")
    private String totalPrice;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}
