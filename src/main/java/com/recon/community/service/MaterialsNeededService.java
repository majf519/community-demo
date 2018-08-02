package com.recon.community.service;

import com.recon.community.entity.MaterialsNeeded;

import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
public interface MaterialsNeededService {

    /**
     * 获取事项所需的材料列表
     *
     * @param id
     * @return
     */
    List<MaterialsNeeded> listMaterialsNeeded(String id);
}
