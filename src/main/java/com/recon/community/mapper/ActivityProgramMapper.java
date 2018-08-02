package com.recon.community.mapper;

import com.recon.community.entity.ActivityProgram;

public interface ActivityProgramMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActivityProgram record);

    int insertSelective(ActivityProgram record);

    ActivityProgram selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActivityProgram record);

    int updateByPrimaryKey(ActivityProgram record);
}