package com.recon.community.mapper;

import com.recon.community.entity.Residents;

public interface ResidentsMapper {
    int deleteByPrimaryKey(String id);

    int insert(Residents record);

    int insertSelective(Residents record);

    Residents selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Residents record);

    int updateByPrimaryKey(Residents record);
}