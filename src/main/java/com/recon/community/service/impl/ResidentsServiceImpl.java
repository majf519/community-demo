package com.recon.community.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.recon.community.entity.Operation;
import com.recon.community.entity.Residents;
import com.recon.community.entity.User;
import com.recon.community.exception.InvalidException;
import com.recon.community.mapper.ResidentsMapper;
import com.recon.community.mapper.UserMapper;
import com.recon.community.service.OperationService;
import com.recon.community.service.ResidentsService;
import com.recon.community.service.UserService;
import com.recon.community.util.RedisTemplateUtil;
import com.recon.community.util.UuidUtil;
import com.recon.community.vo.UserVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/7/9
 **/
@Service
@Transactional(rollbackFor = Throwable.class)
public class ResidentsServiceImpl extends ServiceImpl<ResidentsMapper, Residents> implements ResidentsService {

    @Autowired
    private ResidentsMapper residentsMapper;

    @Override
    public Residents getResidentsByIdCard(String idCard) {
        return residentsMapper.getResidentsByIdCard(idCard);
    }
}
