package com.recon.community.service;

import com.recon.community.entity.Activity;
import com.recon.community.vo.ActivityVO;

import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
public interface ActivityService {

    /**
     * 综合查询活动项目
     *
     * @param name
     * @param administrativeLine
     * @param form
     * @param saveStatus
     * @return
     */
    List<Activity> listActivity(String name, String administrativeLine, String form, String saveStatus);

    /**
     * 新增项目活动
     *
     * @param activityVO
     */
    void addActivity(ActivityVO activityVO);

    /**
     * 删除项目活动
     *
     * @param id
     */
    void deleteActivity(String id);

    /**
     * 根据活动项目id获取项目活动详情
     *
     * @param id
     * @return
     */
    Activity getActivity(String id);

    /**
     * 修改活动项目的活动状态
     */
    void updateActivitySaveStatus(String id, String saveStatus);

    /**
     * 修改活动项目的进度
     */
    void updateActivitySchedule(String id,String schedule);
}
