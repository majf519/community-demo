package com.recon.community.controller;

import com.alibaba.fastjson.JSONObject;
import com.recon.community.entity.Annex;
import com.recon.community.service.AnnexService;
import com.recon.core.vo.OptResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/7/28
 **/
@Api(value = "附件接口", tags = "附件接口")
@RestController
@RequestMapping("/community/civil/annex")
public class AnnexController {

    private static Logger logger = LoggerFactory.getLogger(AnnexController.class);

    @Autowired
    private AnnexService annexService;

    @GetMapping("/list/{id}")
    @ApiOperation(value = "获取所需材料附件列表", notes = "获取所需材料附件列表")
    @ApiImplicitParam(name = "id", value = "材料id", paramType = "path", dataType = "String", required = true)
    public OptResult listAnnex(@PathVariable String id) {
        logger.info("获取所需材料附件列表 材料id: " + id);
        OptResult result = new OptResult();
        List<Annex> annexList = annexService.listAnnex(id);
        result.setBody(annexList);
        return result;
    }

    @PutMapping("/")
    @ApiOperation(value = "修改附件信息", notes = "修改附件信息")
    public OptResult updateAnnex(@RequestBody Annex annex) {
        logger.info("修改附件信息 annex: "+ JSONObject.toJSONString(annex));
        OptResult result = new OptResult();
        annexService.updateAnnex(annex);
        return result;
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除附件信息", notes = "删除附件信息")
    @ApiImplicitParam(name = "id", value = "附件id", paramType = "path", dataType = "String", required = true)
    public OptResult deleteAnnex(@PathVariable String id) {
        logger.info("删除附件信息 附件id:"+id);
        OptResult result = new OptResult();
        annexService.deleteAnnex(id);
        return result;
    }

}
