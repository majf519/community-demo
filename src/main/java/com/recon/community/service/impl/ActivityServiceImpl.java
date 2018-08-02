package com.recon.community.service.impl;

import com.recon.community.entity.Activity;
import com.recon.community.mapper.ActivityMapper;
import com.recon.community.service.ActivityService;
import com.recon.community.util.RedisTemplateUtil;
import com.recon.community.util.UuidUtil;
import com.recon.community.vo.ActivityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
@Service
@Transactional(rollbackFor = Throwable.class)
public class ActivityServiceImpl implements ActivityService {


    @Autowired
    private RedisTemplateUtil redisTemplateUtil;

    @Autowired
    private ActivityMapper activityMapper;

    @Override
    public List<Activity> listActivity(String name, String administrativeLine, String form, String saveStatus) {
        return activityMapper.listActivity(name, administrativeLine, form, saveStatus);
    }

    @Override
    public void addActivity(ActivityVO activityVO) {
        Activity activity = new Activity();
        BeanUtils.copyProperties(activityVO, activity);
        activity.setId(UuidUtil.getUuid());
        if ("0".equals(activityVO.getType())) {
            // 暂存
            activity.setCreateTime(new Date());
            activity.setUpdateTime(new Date());
            String residentsId = redisTemplateUtil.get("residentsId");
            activity.setCreateUser(residentsId);
            activity.setUpdateUser(residentsId);
            activity.setSaveStatus("0");
        }
        if ("1".equals(activityVO.getType())) {
            // 保存
            activity.setCreateTime(new Date());
            activity.setUpdateTime(new Date());
            String residentsId = redisTemplateUtil.get("residentsId");
            activity.setCreateUser(residentsId);
            activity.setUpdateUser(residentsId);
            activity.setSaveStatus("1");
            activity.setSchedule("0");
        }
        activityMapper.insert(activity);
    }

    @Override
    public void deleteActivity(String id) {
        activityMapper.deleteActivity(id);
    }

    @Override
    public Activity getActivity(String id) {
        return activityMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateActivitySaveStatus(String id, String saveStatus) {
        activityMapper.updateActivitySaveStatus(id, saveStatus);
    }

    @Override
    public void updateActivitySchedule(String id, String schedule) {
        activityMapper.updateActivitySchedule(id, schedule);
    }
}
