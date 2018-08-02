package com.recon.community.mapper;

import com.recon.community.entity.MaterialsNeeded;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialsNeededMapper {
    int insert(MaterialsNeeded record);

    int insertSelective(MaterialsNeeded record);

    /**
     * 获取事项所需材料列表
     *
     * @param id
     * @return
     */
    List<MaterialsNeeded> listMaterialsNeeded(@Param("id") String id);
}