package com.recon.community.controller;

import com.alibaba.fastjson.JSONObject;
import com.recon.community.entity.ActivityProgram;
import com.recon.community.service.ActivityProgramService;
import com.recon.core.vo.OptResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
@RestController
@RequestMapping("/community/housekeeping/activity/program")
@Api(value = "活动方案接口",tags = "活动方案接口")
public class ActivityProgramController {

    private static Logger logger = LoggerFactory.getLogger(ActivityController.class);

    private ActivityProgramService activityProgramService;

    @PostMapping("add")
    @ApiOperation(value = "添加活动方案", notes = "添加活动方案", produces = MediaType.APPLICATION_JSON_VALUE)
    public OptResult addActivityProgram(@RequestBody ActivityProgram activityProgram) {
        logger.info("添加活动方案 活动方案:" + JSONObject.toJSONString(activityProgram));
        OptResult result = new OptResult();
        // todo
        return result;
    }
}
