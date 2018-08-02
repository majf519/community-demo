package com.recon.community.mapper;

import com.recon.community.entity.ActivityRegistration;

public interface ActivityRegistrationMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActivityRegistration record);

    int insertSelective(ActivityRegistration record);

    ActivityRegistration selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActivityRegistration record);

    int updateByPrimaryKey(ActivityRegistration record);
}