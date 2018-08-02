package com.recon.community.controller;

import com.recon.community.entity.ProductStock;
import com.recon.core.vo.OptResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
@RestController
@RequestMapping("/community/housekeeping/product/stock")
@Api(value = "库存商品接口",tags = "库存商品接口")
public class ProductStockController {

    private static Logger logger = LoggerFactory.getLogger(ProductStockController.class);

    @GetMapping("/list")
    @ApiOperation(value = "获取库存商品列表",notes = "获取库存商品列表",response = ProductStock.class,responseContainer = "Map")
    public OptResult listProductStock(){
        logger.info("获取库存商品列表");
        OptResult result = new OptResult();

        return result;
    }

}
