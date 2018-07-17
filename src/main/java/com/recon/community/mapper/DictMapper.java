package com.recon.community.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.recon.community.entity.Dict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/7/9
 **/
public interface DictMapper extends BaseMapper<Dict> {

    /**
     * 动态参数获取字典列表
     *
     * @param id
     * @param dictValue
     * @return
     */
    List<Dict> listDictByName(@Param("id") String id,@Param("dictValue") String dictValue);

}
