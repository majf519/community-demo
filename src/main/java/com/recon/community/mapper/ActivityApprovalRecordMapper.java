package com.recon.community.mapper;

import com.recon.community.entity.ActivityApprovalRecord;

public interface ActivityApprovalRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActivityApprovalRecord record);

    int insertSelective(ActivityApprovalRecord record);

    ActivityApprovalRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActivityApprovalRecord record);

    int updateByPrimaryKey(ActivityApprovalRecord record);
}