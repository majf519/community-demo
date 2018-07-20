package com.recon.community.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.recon.community.entity.Residents;
import com.recon.community.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResidentsMapper extends BaseMapper<Residents> {

    int updateByPrimaryKeySelective(Residents record);

    int updateByPrimaryKey(Residents record);

    /**
     * 根据家庭编号获取家庭成员
     *
     * @param houseCode
     * @return
     */
    List<Residents> listResidents(@Param("houseCode") String houseCode);

    /**
     * 删除用户
     *
     * @param id
     */
    void deleteUser(@Param("id") String id);
}