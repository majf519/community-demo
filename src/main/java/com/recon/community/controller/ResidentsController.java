package com.recon.community.controller;

import com.recon.community.entity.Residents;
import com.recon.community.service.ResidentsService;
import com.recon.core.vo.OptResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel.xue
 * @create 2018/7/19
 **/
@Api(value = "居民接口", tags = "居民接口")
@RestController
@RequestMapping("/community/family-plan/residents")
public class ResidentsController {

    @Autowired
    private ResidentsService residentsService;

    @ApiOperation(value = "根据居民id获取居民信息", notes = "根据居民id获取居民信息", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParam(name = "id", value = "居民id", paramType = "path", dataType = "String", required = true)
    @GetMapping(value = "/get/{id}")
    public OptResult getResidents(@PathVariable String id) {
        OptResult result = new OptResult();
        Residents residents = residentsService.selectById(id);
        result.setBody(residents);
        return result;
    }
}
