package com.recon.community.controller;

import com.recon.community.entity.Evaluation;
import com.recon.community.service.EvaluationService;
import com.recon.core.vo.OptResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Tag;
import org.hibernate.validator.constraints.SafeHtml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author daniel.xue
 * @create 2018/7/28
 **/
@RestController
@RequestMapping("/community/civil/evaluation")
@Api(value = "评价接口",tags = "评价接口")
public class EvaluationController {

    private static Logger logger = LoggerFactory.getLogger(EvaluationController.class);

    @Autowired
    private EvaluationService evaluationService;

    @ApiOperation(value = "添加评价",notes = "添加评价")
    @PostMapping("/")
    public OptResult addEvaluation(@RequestBody Evaluation evaluation){
        logger.info("添加评价");
        OptResult optResult = new OptResult();
        evaluationService.addEvaluation(evaluation);
        return optResult;
    }
}
