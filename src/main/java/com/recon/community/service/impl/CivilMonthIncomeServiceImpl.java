package com.recon.community.service.impl;

import com.recon.community.entity.CivilMonthIncome;
import com.recon.community.mapper.CivilMonthIncomeMapper;
import com.recon.community.service.CivilMonthIncomeService;
import com.recon.community.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/7/19
 **/
@Service
@Transactional
public class CivilMonthIncomeServiceImpl implements CivilMonthIncomeService{

    @Autowired
    private CivilMonthIncomeMapper civilMonthIncomeMapper;

    @Override
    public List<CivilMonthIncome> listIncome(String residentsId) {
        return civilMonthIncomeMapper.listIncome(residentsId);
    }

    @Override
    public CivilMonthIncome getIncome(String id) {
        return civilMonthIncomeMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addIncome(CivilMonthIncome civilMonthIncome) {
        String id = UuidUtil.getUuid();
        civilMonthIncome.setId(id);
        civilMonthIncomeMapper.insert(civilMonthIncome);
    }

    @Override
    public void updateIncome(CivilMonthIncome civilMonthIncome) {
            civilMonthIncomeMapper.updateByPrimaryKey(civilMonthIncome);
    }

    @Override
    public void deleteIncome(String id) {
        civilMonthIncomeMapper.deleteIncome(id);
    }
}
