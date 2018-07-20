package com.recon.community.controller;

import com.recon.community.entity.CivilMonthIncome;
import com.recon.community.entity.Residents;
import com.recon.community.service.CivilMonthIncomeService;
import com.recon.core.vo.OptResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/7/19
 **/
@Api(value = "月收入接口",tags = "月收入接口")
@RestController
@RequestMapping("/community/civil/low-insured/income")
public class CivilMonthIncomeController {

    @Autowired
    private CivilMonthIncomeService civilMonthIncomeService;

    @GetMapping("list")
    @ApiOperation(value = "根据居民id获取月收入信息",notes = "根据居民id获取月收入信息", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParam(name = "residentsId", value = "居民id", paramType = "query", dataType = "String", required = true)
    public OptResult listIncome(@RequestParam String residentsId) {
        OptResult result = new OptResult();
        List<CivilMonthIncome> civilMonthIncomeList = civilMonthIncomeService.listIncome(residentsId);
        result.setBody(civilMonthIncomeList);
        return result;
    }

    @GetMapping("get/{id}")
    @ApiOperation(value = "获取月收入信息",notes = "获取月收入信息", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParam(name = "id", value = "收入id", paramType = "path", dataType = "String", required = true)
    public OptResult getIncome(@PathVariable String id) {
        OptResult result = new OptResult();
        CivilMonthIncome civilMonthIncomeList = civilMonthIncomeService.getIncome(id);
        result.setBody(civilMonthIncomeList);
        return result;
    }

    @PostMapping("add")
    @ApiOperation(value = "添加月收入信息",notes = "添加月收入信息", produces = MediaType.APPLICATION_JSON_VALUE)
    public OptResult addIncome(@RequestBody CivilMonthIncome civilMonthIncome) {
        OptResult result = new OptResult();
        civilMonthIncomeService.addIncome(civilMonthIncome);
        return result;
    }

    @PutMapping("update")
    @ApiOperation(value = "修改月收入信息",notes = "修改月收入信息", produces = MediaType.APPLICATION_JSON_VALUE)
    public OptResult updateIncome(@RequestBody CivilMonthIncome civilMonthIncome) {
        OptResult result = new OptResult();
        civilMonthIncomeService.updateIncome(civilMonthIncome);
        return result;
    }

    @DeleteMapping("delete/{id}")
    @ApiOperation(value = "删除月收入信息",notes = "删除月收入信息", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParam(name = "id", value = "收入id", paramType = "path", dataType = "String", required = true)
    public OptResult deleteIncome(@PathVariable String id) {
        OptResult result = new OptResult();
        civilMonthIncomeService.deleteIncome(id);
        return result;
    }

}
