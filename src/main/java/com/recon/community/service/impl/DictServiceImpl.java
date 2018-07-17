package com.recon.community.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.recon.community.entity.Dict;
import com.recon.community.mapper.DictMapper;
import com.recon.community.service.DictService;
import com.recon.community.util.UuidUtil;
import com.recon.community.vo.DictVO;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/7/17
 **/
@Service
@Transactional(rollbackFor = Throwable.class)
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements DictService {

    @Autowired
    private DictMapper dictMapper;

    @Override
    public List<DictVO> listDictByIdAndName(String id,String dictValue) {
        List<DictVO> dictVOList = Lists.newArrayList();
        List<Dict> dictList = dictMapper.listDictByName(id,dictValue);
        if (dictList != null & dictList.size() > 0) {
            for (Dict dict : dictList) {
                DictVO dictVO = new DictVO();
                BeanUtils.copyProperties(dict, dictVO);
                dictVOList.add(dictVO);
            }
        }
        return dictVOList;
    }




}
