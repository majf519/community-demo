package com.recon.community.controller;

import com.alibaba.fastjson.JSONObject;
import com.recon.community.vo.ActivityNoticeVO;
import com.recon.core.vo.OptResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
@RestController
@Api(value = "通知接口",tags = "通知接口")
@RequestMapping("/community/housekeeping/notice")
public class NoticeController {

    private static Logger logger = LoggerFactory.getLogger(NoticeController.class);

    @PostMapping(value = "/add")
    @ApiOperation(value = "通知志愿者",notes = "通知志愿者")
    public OptResult activityNotice(@RequestBody ActivityNoticeVO activityNoticeVO){
        logger.info("通知志愿者 通知信息:" + JSONObject.toJSONString(activityNoticeVO));
        OptResult result = new OptResult();
        // todo
        return result;
    }
}
