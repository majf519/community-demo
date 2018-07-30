package com.recon.community.service;

import com.baomidou.mybatisplus.service.IService;
import com.recon.community.entity.Evaluation;

/**
 * @author daniel.xue
 * @create 2018/7/28
 **/
public interface EvaluationService extends IService<Evaluation> {

    /**
     * 添加评价
     *
     * @param evaluation
     */
    void addEvaluation(Evaluation evaluation);
}
