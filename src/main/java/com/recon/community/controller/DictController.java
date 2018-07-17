package com.recon.community.controller;

import com.recon.community.service.DictService;
import com.recon.community.vo.DictVO;
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
 * @create 2018/7/17
 **/
@RestController
@RequestMapping("/community/dict/")
@Api(value = "字典接口", tags = "字典接口")
public class DictController {

    private static Logger logger = LoggerFactory.getLogger(DictController.class);

    @Autowired
    private DictService dictService;

    @ApiOperation(value = "动态参数获取字典列表", notes = "动态参数获取字典列表", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "/{id}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "父类id", paramType = "path", dataType = "String", required = true),
            @ApiImplicitParam(name = "dictValue", value = "字典名称", paramType = "query", dataType = "String")
    })
    public OptResult listDictByName(@PathVariable String id, @RequestParam(required = false) String dictValue) {
        logger.info("动态参数获取字典列表 id:" + id + " 名称:" + dictValue);
        OptResult result = new OptResult();
        List<DictVO> dictVOList = dictService.listDictByIdAndName(id,dictValue);
        result.setBody(dictVOList);
        return result;
    }
}
