package com.recon.community.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * @author daniel.xue
 * @create 2018/7/28
 **/
@TableName(value = "evaluation")
public class Evaluation {

    @TableId(value = "id")
    private String id;

    @TableField(value = "content")
    private String content;

    @TableField(value = "residents_id")
    private String residentsId;

    @TableField(value = "level")
    private String level;

    @TableField(value = "apply_id")
    private String applyId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getResidentsId() {
        return residentsId;
    }

    public void setResidentsId(String residentsId) {
        this.residentsId = residentsId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }
}
