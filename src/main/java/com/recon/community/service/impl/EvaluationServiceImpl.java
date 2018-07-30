package com.recon.community.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.recon.community.entity.Evaluation;
import com.recon.community.mapper.EvaluationMapper;
import com.recon.community.service.EvaluationService;
import com.recon.community.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author daniel.xue
 * @create 2018/7/28
 **/
@Service
@Transactional(rollbackFor = Throwable.class)
public class EvaluationServiceImpl extends ServiceImpl<EvaluationMapper,Evaluation> implements EvaluationService {

    @Autowired
    private EvaluationMapper evaluationMapper;

    @Override
    public void addEvaluation(Evaluation evaluation) {
        evaluation.setId(UuidUtil.getUuid());
        evaluationMapper.insert(evaluation);
    }
}
