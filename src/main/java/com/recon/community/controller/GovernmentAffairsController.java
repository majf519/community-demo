package com.recon.community.controller;

import com.recon.community.entity.GovernmentAffairs;
import com.recon.community.entity.GuideConfiguration;
import com.recon.community.service.GovernmentAffairsService;
import com.recon.community.vo.GovernmentAffairsVO;
import com.recon.core.vo.OptResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/community/resident/")
@Api(value = "政务服务接口", tags = "政务服务接口")
public class GovernmentAffairsController {

    private static Logger logger = LoggerFactory.getLogger(GovernmentAffairsController.class);

    @Autowired
    private GovernmentAffairsService governmentAffairsService;

    @ApiOperation(value = "综合查询", notes = "综合查询", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "governmentAffairsList")
    public OptResult governmentAffairsList(@RequestParam String businessName, @RequestParam String businessType){
        logger.info("政务申请记录");
        GovernmentAffairsVO governmentAffairsVO = new GovernmentAffairsVO();
        governmentAffairsVO.setBusinessName(businessName);
        governmentAffairsVO.setBusinessType(businessType);
        OptResult result = new OptResult();
        List<GovernmentAffairs> governmentAffairsList= governmentAffairsService.getGovernmentAffairsList(governmentAffairsVO);
        result.setBody(governmentAffairsList);

        return result;
    }

    @ApiOperation(value = "模板查询", notes = "模板查询", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "getGuideConfigurationList")
    public OptResult getGuideConfiguration(@RequestParam String id){
        logger.info("模板配置详情");
        List<GuideConfiguration> guideConfigurationList = governmentAffairsService.getGuideConfigurationList(id);

        OptResult result = new OptResult();
        result.setBody(guideConfigurationList);
        return result;
    }
}
