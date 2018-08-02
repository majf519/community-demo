package com.recon.community.mapper;

import com.recon.community.entity.ActivityVolunteer;

public interface ActivityVolunteerMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActivityVolunteer record);

    int insertSelective(ActivityVolunteer record);

    ActivityVolunteer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActivityVolunteer record);

    int updateByPrimaryKey(ActivityVolunteer record);
}