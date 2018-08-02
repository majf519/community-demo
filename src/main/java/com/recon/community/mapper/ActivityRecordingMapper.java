package com.recon.community.mapper;

import com.recon.community.entity.ActivityRecording;

public interface ActivityRecordingMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActivityRecording record);

    int insertSelective(ActivityRecording record);

    ActivityRecording selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActivityRecording record);

    int updateByPrimaryKey(ActivityRecording record);
}