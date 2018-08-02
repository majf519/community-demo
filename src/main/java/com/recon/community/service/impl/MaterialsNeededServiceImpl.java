package com.recon.community.service.impl;

import com.recon.community.entity.MaterialsNeeded;
import com.recon.community.mapper.MaterialsNeededMapper;
import com.recon.community.service.MaterialsNeededService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/8/2
 **/
@Service
@Transactional(rollbackFor = Throwable.class)
public class MaterialsNeededServiceImpl implements MaterialsNeededService {

    @Autowired
    private MaterialsNeededMapper materialsNeededMapper;

    @Override
    public List<MaterialsNeeded> listMaterialsNeeded(String id) {
        return materialsNeededMapper.listMaterialsNeeded(id);
    }
}
