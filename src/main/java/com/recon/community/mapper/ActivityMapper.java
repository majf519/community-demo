package com.recon.community.mapper;

import com.recon.community.entity.Activity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityMapper {
    int deleteByPrimaryKey(String id);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);

    /**
     * 综合查询活动项目
     *
     * @param name
     * @param administrativeLine
     * @param form
     * @param saveStatus
     * @return
     */
    List<Activity> listActivity(@Param("name") String name, @Param("administrativeLine") String administrativeLine,
                                @Param("form") String form, @Param("saveStatus") String saveStatus);

    /**
     * 删除活动项目
     *
     * @param id
     */
    void deleteActivity(String id);

    /**
     * 修改活动项目的活动状态
     *
     * @param id
     * @param saveStatus
     */
    void updateActivitySaveStatus(@Param("id") String id, @Param("saveStatus") String saveStatus);

    /**
     * 修改活动项目的进度
     *
     * @param id
     * @param schedule
     */
    void updateActivitySchedule(@Param("id") String id, @Param("schedule") String schedule);
}