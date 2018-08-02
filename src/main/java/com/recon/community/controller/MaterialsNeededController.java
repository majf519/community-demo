package com.recon.community.controller;

import com.recon.community.entity.MaterialsNeeded;
import com.recon.community.service.MaterialsNeededService;
import com.recon.core.vo.OptResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
@RestController
@Api(value = "事项所需材料接口", tags = "事项所需材料接口")
@RequestMapping(value = "/community/public/material")
public class MaterialsNeededController {

    private static Logger logger = LoggerFactory.getLogger(MaterialsNeededController.class);

    @Autowired
    private MaterialsNeededService materialsNeededService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "根据事项id获取事项所需材料", notes = "根据事项id获取事项所需材料",response = MaterialsNeeded.class,responseContainer = "Map")
    @ApiImplicitParam(name = "id", value = "事项id", paramType = "path", dataType = "String", required = true)
    public OptResult listMaterialsNeeded(@PathVariable String id) {
        logger.info("根据事项id获取事项所需材料 事项id:" + id);
        OptResult result = new OptResult();
        List<MaterialsNeeded> materialsNeededList = materialsNeededService.listMaterialsNeeded(id);
        result.setBody(materialsNeededList);
        return result;
    }
}
