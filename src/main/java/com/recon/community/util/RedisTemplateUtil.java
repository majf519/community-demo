package com.recon.community.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Redis工具类
 *
 * @author Daniel.Xue
 * @date 2018/4/16
 */
@Service
public class RedisTemplateUtil {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 设置String缓存值
     *
     * @param key
     * @param value
     */
    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    /**
     * 获取String缓存的值
     *
     * @param key
     * @return
     */
    public String get(String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }

    /**
     * 是否存在指定缓存
     *
     * @param key
     * @return
     */
    public Boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * 删除指定缓存
     *
     * @param key
     */
    public void del(String key) {
        redisTemplate.opsForValue().getOperations().delete(key);
    }

    /**
     * 设置缓存值并设置有效期
     * 时间单位：秒
     *
     * @param key
     * @param value
     */
    public void setForTime(String key, String value, long time) {
        redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
    }

    /**
     * 获取token的有效期
     *
     * @param key
     */
    public long getExpireTime(String key) {
        return redisTemplate.getExpire(key);
    }

    /**
     * 设置list缓存值
     *
     * @param key
     * @param value
     */
    public void lPush(String key, String value) {
        redisTemplate.opsForList().leftPush(key, value);
    }

    /**
     * 获取集合中的缓存
     *
     * @param key
     * @return
     */
    public String rPop(String key) {
        return (String) redisTemplate.opsForList().rightPop(key);
    }

    /**
     * 获得所有的keys
     */
    public Set<String> listKeys(String keyPre) {
        Set<String> keys = null;
        if (StringUtils.isNotBlank(keyPre)) {
            return redisTemplate.keys(keyPre + "*");
        } else {
            return redisTemplate.keys("*");
        }
    }
}
