package com.recon.community.mapper;

import com.recon.community.entity.RecordingPhoto;

public interface RecordingPhotoMapper {
    int deleteByPrimaryKey(String id);

    int insert(RecordingPhoto record);

    int insertSelective(RecordingPhoto record);

    RecordingPhoto selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RecordingPhoto record);

    int updateByPrimaryKey(RecordingPhoto record);
}