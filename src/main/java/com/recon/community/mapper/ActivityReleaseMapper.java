package com.recon.community.mapper;

import com.recon.community.entity.ActivityRelease;

public interface ActivityReleaseMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActivityRelease record);

    int insertSelective(ActivityRelease record);

    ActivityRelease selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActivityRelease record);

    int updateByPrimaryKey(ActivityRelease record);
}