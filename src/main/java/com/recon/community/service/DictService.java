package com.recon.community.service;

import com.baomidou.mybatisplus.service.IService;
import com.recon.community.entity.Dict;
import com.recon.community.vo.DictVO;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


/**
 * @author daniel.xue
 * @create 2018/7/17
 **/
public interface DictService extends IService<Dict> {

    /**
     * 动态参数获取字典列表
     *
     * @param id
     * @param dictValue
     * @return
     */
    List<DictVO> listDictByIdAndName(String id, String dictValue);
}
