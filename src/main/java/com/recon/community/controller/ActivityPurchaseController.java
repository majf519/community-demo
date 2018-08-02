package com.recon.community.controller;

import com.alibaba.fastjson.JSONObject;
import com.recon.community.entity.Activity;
import com.recon.community.entity.ActivityPurchase;
import com.recon.community.vo.ActivityPurchaseVO;
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
@Api(value = "活动采购商品接口",tags = "活动采购商品接口")
@RestController
@RequestMapping("/community/housekeeping/activity/purchase")
public class ActivityPurchaseController {

    private static Logger logger = LoggerFactory.getLogger(ActivityPurchaseController.class);

    @GetMapping("/list/{id}")
    @ApiOperation(value = "根据活动项目id获取采购清单列表",notes = "根据活动项目id获取采购清单列表",response = ActivityPurchase.class, responseContainer = "Map")
    @ApiImplicitParam(name = "id", value = "活动项目id", paramType = "path", dataType = "String")
    public OptResult listActivityPurchase(@PathVariable String id){
        logger.info("根据活动项目id获取采购清单列表  活动id:"+id);
        OptResult result = new OptResult();
        // todo
        return result;
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "根据采购清单id删除采购清单",notes = "根据采购清单id删除采购清单")
    @ApiImplicitParam(name = "id", value = "采购清单id", paramType = "path", dataType = "String")
    public OptResult deleteActivityPurchase(@PathVariable String id){
        logger.info("根据采购清单id删除采购清单  采购清单id:"+id);
        OptResult result = new OptResult();
        // todo
        return result;
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加采购物品",notes = "添加采购物品")
    public OptResult addActivityPurchase(@RequestBody ActivityPurchaseVO activityPurchaseVO){
        logger.info("添加采购物品  activityPurchaseVO:"+ JSONObject.toJSONString(activityPurchaseVO));
        OptResult result = new OptResult();
        // todo
        return result;
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改采购物品",notes = "修改采购物品")
    public OptResult updateActivityPurchase(@RequestBody ActivityPurchase activityPurchase){
        logger.info("修改采购物品  activityPurchase:"+ JSONObject.toJSONString(activityPurchase));
        OptResult result = new OptResult();
        // todo
        return result;
    }

    @GetMapping("/get/{id}")
    @ApiOperation(value = "根据采购清单id获取采购清单详情",notes = "根据采购清单id获取采购清单详情",response = ActivityPurchase.class, responseContainer = "Map")
    @ApiImplicitParam(name = "id", value = "采购清单id", paramType = "path", dataType = "String")
    public OptResult getActivityPurchase(@PathVariable String id){
        logger.info("根据活动项目id获取采购清单列表  活动id:"+id);
        OptResult result = new OptResult();
        // todo
        return result;
    }



}
