package com.recon.community.controller;

import com.alibaba.fastjson.JSONObject;
import com.recon.community.entity.ActivitySignIn;
import com.recon.community.vo.ActivitySignInVO;
import com.recon.core.vo.OptResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
@RestController
@RequestMapping("/community/housekeeping/activity/sign-in")
@Api(value = "活动签到接口", tags = "活动签到接口")
public class ActivitySignInController {

    private static Logger logger = LoggerFactory.getLogger(ActivitySignInController.class);

    @PostMapping("/add")
    @ApiOperation(value = "添加活动签到表信息", notes = "添加活动签到表信息")
    public OptResult addActivitySignIn(@RequestBody ActivitySignInVO activitySignInVo) {
        logger.info("添加活动签到表信息 文件信息:" + JSONObject.toJSONString(activitySignInVo));
        OptResult result = new OptResult();
        // todo
        return result;
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "删除活动签到表信息", notes = "删除活动签到表信息")
    @ApiImplicitParam(name = "id", value = "信息id", paramType = "path", dataType = "String", required = true)
    public OptResult deleteActivitySignIn(@PathVariable String id) {
        logger.info("删除活动签到表信息 信息id:" + id);
        OptResult result = new OptResult();
        // todo
        return result;
    }

    
}
