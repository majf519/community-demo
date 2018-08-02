package com.recon.community.mapper;

import com.recon.community.entity.ActivitySignIn;

public interface ActivitySignInMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActivitySignIn record);

    int insertSelective(ActivitySignIn record);

    ActivitySignIn selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActivitySignIn record);

    int updateByPrimaryKey(ActivitySignIn record);
}