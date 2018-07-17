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
public interface UserService extends IService<User> {

    /**
     * 用户登陆
     *
     * @param userVO
     * @return
     */
    User login(UserVO userVO);

    /**
     * 根据token获取用户
     */
    User getUserByToken(String token);

    /**
     * 获取用户
     *
     * @return
     */
    Residents getUser();

    /**
     * 获取家庭成员
     *
     * @param id
     * @return
     */
    List<Residents> listFamily(String id);

    /**
     * 删除用户
     *
     * @param id
     */
    void delelteUser(String id);

    /**
     * 修改用户
     *
     * @param residents
     */
    void updateUser(Residents residents);

    /**
     * 添加用户
     *
     * @param residents
     */
    void addUser(Residents residents);
}
