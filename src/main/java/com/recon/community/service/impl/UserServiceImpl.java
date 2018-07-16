package com.recon.community.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.recon.community.entity.Operation;
import com.recon.community.entity.User;
import com.recon.community.exception.InvalidException;
import com.recon.community.mapper.UserMapper;
import com.recon.community.service.OperationService;
import com.recon.community.service.UserService;
import com.recon.community.util.RedisTemplateUtil;
import com.recon.community.util.UuidUtil;
import com.recon.community.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author daniel.xue
 * @create 2018/7/9
 **/
@Service
@Transactional(rollbackFor = Throwable.class)
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplateUtil redisTemplateUtil;

    @Autowired
    private OperationService operationService;

    @Override
    public User login(UserVO userVO) {
        // 获取用户
        User user = userMapper.getUserByUsernameAndPassword(userVO);
        if(user==null){
            throw  new InvalidException("用户不存在");
        }
        String token = "token";
        userMapper.setTokenById(user.getId(),token);
        redisTemplateUtil.set(token,user.getId());
        user.setToken(token);
        String id = UuidUtil.getUuid();
        Operation operation = new Operation(id, user.getId(), "用户模块", "用户登陆", new Date(), "0");
        operationService.insert(operation);
        return user;
    }

    @Override
    public User getUserByToken(String token) {
        return userMapper.getUserByToken(token);
    }
}