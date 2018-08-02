package com.recon.community.mapper;

import com.recon.community.entity.ActivityEvaluation;

public interface ActivityEvaluationMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActivityEvaluation record);

    int insertSelective(ActivityEvaluation record);

    ActivityEvaluation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActivityEvaluation record);

    int updateByPrimaryKey(ActivityEvaluation record);
}