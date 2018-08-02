package com.recon.community.mapper;

import com.recon.community.entity.NewsEvaluation;

public interface NewsEvaluationMapper {
    int deleteByPrimaryKey(String id);

    int insert(NewsEvaluation record);

    int insertSelective(NewsEvaluation record);

    NewsEvaluation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(NewsEvaluation record);

    int updateByPrimaryKey(NewsEvaluation record);
}