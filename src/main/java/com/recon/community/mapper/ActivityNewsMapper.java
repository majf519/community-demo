package com.recon.community.mapper;

import com.recon.community.entity.ActivityNews;

public interface ActivityNewsMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActivityNews record);

    int insertSelective(ActivityNews record);

    ActivityNews selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActivityNews record);

    int updateByPrimaryKey(ActivityNews record);
}