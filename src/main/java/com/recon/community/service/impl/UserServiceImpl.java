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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ResidentsMapper residentsMapper;

    @Autowired
    private RedisTemplateUtil redisTemplateUtil;

    @Autowired
    private OperationService operationService;

    @Override
    public User login(UserVO userVO) {
        // 获取用户
        User user = userMapper.getUserByUsernameAndPassword(userVO);
        if (user == null) {
            throw new InvalidException("用户不存在");
        }
        String token = "token";
        userMapper.setTokenById(user.getId(), token);
        redisTemplateUtil.set(token, user.getId());
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

    @Override
    public Residents getUser() {
        // todo 身份证扫描
        Residents residents = new Residents();
        String userId = redisTemplateUtil.get("token");
        User user = userMapper.selectById(userId);
        if (user != null & StringUtils.isNotBlank(user.getResidentsId())) {
            residents = residentsMapper.selectByPrimaryKey(user.getResidentsId());
        }
        return residents;
    }

    @Override
    public List<Residents> listFamily(String id) {
        List<Residents> residentsList = Lists.newArrayList();
        Residents residents = residentsMapper.selectByPrimaryKey(id);
        if (residents != null ) {
            residentsList = residentsMapper.listResidents(residents.getHouseCode());
            if (residentsList != null & residentsList.size() > 0) {
                for (Residents residents1 : residentsList) {
                    if(residents1.getId().equals(residents.getId())){
                        residentsList.remove(residents1);
                        break;
                    }
                }
            }
        }
        return residentsList;
    }

    @Override
    public void delelteUser(String id) {
        residentsMapper.deleteUser(id);
    }

    @Override
    public void updateUser(Residents residents) {
        residentsMapper.updateByPrimaryKey(residents);
    }

    @Override
    public void addUser(Residents residents) {
        String id = UuidUtil.getUuid();
        residents.setId(id);
        residentsMapper.insert(residents);
    }
}
