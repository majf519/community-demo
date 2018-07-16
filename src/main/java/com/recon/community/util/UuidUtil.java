package com.recon.community.util;

import java.util.UUID;

/**
 * @author caijun
 * @create 2017-12-28 9:49
 * @desc UUID公共类
 */
public class UuidUtil {

    public static String getUuid(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
