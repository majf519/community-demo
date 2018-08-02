package com.recon.community.mapper;

import com.recon.community.entity.ProductStock;

public interface ProductStockMapper {
    int deleteByPrimaryKey(String id);

    int insert(ProductStock record);

    int insertSelective(ProductStock record);

    ProductStock selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ProductStock record);

    int updateByPrimaryKey(ProductStock record);
}