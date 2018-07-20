package com.recon.community.service;

import com.recon.community.entity.CivilMonthIncome;

import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/7/19
 **/
public interface CivilMonthIncomeService {

    List<CivilMonthIncome> listIncome(String residentsId);

    CivilMonthIncome getIncome(String id);

    void addIncome(CivilMonthIncome civilMonthIncome);

    void updateIncome(CivilMonthIncome civilMonthIncome);

    void deleteIncome(String id);
}
