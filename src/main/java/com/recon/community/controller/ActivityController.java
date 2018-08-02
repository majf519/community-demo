package com.recon.community.controller;

import com.alibaba.fastjson.JSONObject;
import com.recon.community.entity.Activity;
import com.recon.community.service.ActivityService;
import com.recon.community.vo.ActivitySaveStatusVO;
import com.recon.community.vo.ActivityVO;
import com.recon.core.vo.OptResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/7/30
 **/
@RestController
@RequestMapping("/community/housekeeping/activity")
@Api(value = "居务活动接口", tags = "居务活动接口")
public class ActivityController {

    private static Logger logger = LoggerFactory.getLogger(ActivityController.class);

    @Autowired
    private ActivityService activityService;

    @GetMapping("/list")
    @ApiOperation(value = "综合查询活动", notes = "综合查询活动", produces = MediaType.APPLICATION_JSON_VALUE,response = Activity.class, responseContainer = "Map")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "活动名称", paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "administrativeLine", value = "行政条线", paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "form", value = "活动形式", paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "saveStatus", value = "活动状态", paramType = "query", dataType = "String"),
    })
    public OptResult listActivity(@RequestParam(required = false) String name, @RequestParam(required = false) String administrativeLine,
                                  @RequestParam(required = false) String form, @RequestParam(required = false) String saveStatus) {
        logger.info("综合查询活动项目");
        OptResult result = new OptResult();
        List<Activity> activityList = activityService.listActivity(name,administrativeLine,form,saveStatus);
        result.setBody(activityList);
        return result;
    }

    @GetMapping("/get/{id}")
    @ApiOperation(value = "根据活动id获取活动详情", notes = "根据活动id获取活动详情", produces = MediaType.APPLICATION_JSON_VALUE,response = Activity.class, responseContainer = "Map")
    @ApiImplicitParam(name = "id", value = "活动id", paramType = "path", dataType = "String", required = true)
    public OptResult getActivity(@PathVariable String id) {
        logger.info("根据活动id获取活动详情 活动id: " + id);
        OptResult result = new OptResult();
        Activity activity = activityService.getActivity(id);
        result.setBody(activity);
        return result;
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "根据活动id删除活动", notes = "根据活动id删除活动", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParam(name = "id", value = "活动id", paramType = "path", dataType = "String", required = true)
    public OptResult deleteActivity(@PathVariable String id) {
        logger.info("根据活动id删除活动 活动id: " + id);
        OptResult result = new OptResult();
        activityService.deleteActivity(id);
        return result;
    }

    @PostMapping("/add")
    @ApiOperation(value = "新增活动", notes = "新增活动", produces = MediaType.APPLICATION_JSON_VALUE)
    public OptResult addActivity(@RequestBody ActivityVO activityVO) {
        logger.info("新增活动 活动: " + JSONObject.toJSONString(activityVO));
        OptResult result = new OptResult();
        activityService.addActivity(activityVO);
        return result;
    }

    @PutMapping("/save-status/update")
    @ApiOperation(value = "修改活动项目状态", notes = "修改活动项目状态", produces = MediaType.APPLICATION_JSON_VALUE)
    public OptResult updateActivitySaveStatus(@RequestBody ActivitySaveStatusVO activitySaveStatusVO) {
        logger.info("修改活动项目状态 活动状态: " + JSONObject.toJSONString(activitySaveStatusVO));
        OptResult result = new OptResult();
        activityService.updateActivitySaveStatus(activitySaveStatusVO.getId(),activitySaveStatusVO.getSaveStatus());
        return result;
    }








}
