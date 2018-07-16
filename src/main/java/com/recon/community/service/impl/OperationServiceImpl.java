package com.recon.community.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.recon.community.entity.Operation;
import com.recon.community.mapper.OperationMapper;
import com.recon.community.service.OperationService;
import org.springframework.stereotype.Service;

/**
 * @author daniel.xue
 * @create 2018/7/16
 **/
@Service
public class OperationServiceImpl extends ServiceImpl<OperationMapper,Operation> implements OperationService {
}
