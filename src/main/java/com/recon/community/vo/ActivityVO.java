package com.recon.community.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
@ApiModel(value = "ActivityVO", description = "活动项目VO")
public class ActivityVO {

    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "活动名称")
    private String name;

    @ApiModelProperty(value = "活动形式")
    private String form;

    @ApiModelProperty(value = "行政条线")
    private String administrativeLine;

    @ApiModelProperty(value = "活动主题")
    private String theme;

    @ApiModelProperty(value = "活动主题自定义")
    private String themeCustomize;

    @ApiModelProperty(value = "活动负责人")
    private String principal;

    @ApiModelProperty(value = "前期通知")
    private String beforeNotice;

    @ApiModelProperty(value = "现场统筹")
    private String siteCoordination;

    @ApiModelProperty(value = "物资准备")
    private String materialPreparation;

    @ApiModelProperty(value = "人员联系")
    private String personContact;

    @ApiModelProperty(value = "信息报道")
    private String informationReport;

    @ApiModelProperty(value = "二维码地址")
    private String address;

    @ApiModelProperty(value = "现场拍照")
    private String scenePhoto;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 保存类型  0 为暂存  1 为提交
     */
    @NotBlank
    @ApiModelProperty(value = "保存类型(0 为暂存  1 提交) ")
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getAdministrativeLine() {
        return administrativeLine;
    }

    public void setAdministrativeLine(String administrativeLine) {
        this.administrativeLine = administrativeLine;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getThemeCustomize() {
        return themeCustomize;
    }

    public void setThemeCustomize(String themeCustomize) {
        this.themeCustomize = themeCustomize;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getBeforeNotice() {
        return beforeNotice;
    }

    public void setBeforeNotice(String beforeNotice) {
        this.beforeNotice = beforeNotice;
    }

    public String getSiteCoordination() {
        return siteCoordination;
    }

    public void setSiteCoordination(String siteCoordination) {
        this.siteCoordination = siteCoordination;
    }

    public String getMaterialPreparation() {
        return materialPreparation;
    }

    public void setMaterialPreparation(String materialPreparation) {
        this.materialPreparation = materialPreparation;
    }

    public String getPersonContact() {
        return personContact;
    }

    public void setPersonContact(String personContact) {
        this.personContact = personContact;
    }

    public String getInformationReport() {
        return informationReport;
    }

    public void setInformationReport(String informationReport) {
        this.informationReport = informationReport;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getScenePhoto() {
        return scenePhoto;
    }

    public void setScenePhoto(String scenePhoto) {
        this.scenePhoto = scenePhoto;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
