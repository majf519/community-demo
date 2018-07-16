package com.recon.community.enums;

/**
 * @author daniel.xue
 * @create 2018/7/16
 **/
public enum OperationEnum {

    USER_MODULE("user","用户模块"),

    /**
     * 添加用户
     */
    USER_ADD("user_post", "添加用户");

    private String type;
    private String description;

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    OperationEnum(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public static String getDescByCode(String type) {

        for (OperationEnum e : OperationEnum.values()) {
            if (e.getType().equals(type)) {
                return e.getDescription();
            }
        }
        return null;
    }

}
