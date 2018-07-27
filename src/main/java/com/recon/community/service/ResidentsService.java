package com.recon.community.service;

import com.baomidou.mybatisplus.service.IService;
import com.recon.community.entity.Residents;
import com.recon.community.entity.User;
import com.recon.community.vo.UserVO;

import java.util.List;


/**
 * @author daniel.xue
 * @create 2018/7/9
 **/
public interface ResidentsService extends IService<Residents> {

    /**
     * 根据居民身份证号获取居民信息
     *
     * @param idCard
     * @return
     */
    Residents getResidentsByIdCard(String idCard);
}
