package com.recon.community.mapper;

import com.recon.community.entity.CivilMonthIncome;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CivilMonthIncomeMapper {
    int deleteByPrimaryKey(String id);

    int insert(CivilMonthIncome record);

    int insertSelective(CivilMonthIncome record);

    CivilMonthIncome selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CivilMonthIncome record);

    int updateByPrimaryKey(CivilMonthIncome record);

    List<CivilMonthIncome> listIncome(@Param("residentsId") String residentsId);

    void deleteIncome(@Param("id") String id);
}