package com.recon.community.mapper;

import com.recon.community.entity.ActivityPurchase;

public interface ActivityPurchaseMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActivityPurchase record);

    int insertSelective(ActivityPurchase record);

    ActivityPurchase selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActivityPurchase record);

    int updateByPrimaryKey(ActivityPurchase record);
}