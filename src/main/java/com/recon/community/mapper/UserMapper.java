package com.recon.community.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.recon.community.entity.User;
import com.recon.community.vo.UserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/7/9
 **/
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据用户名和密码获取用户
     *
     * @param userVO
     */
    User getUserByUsernameAndPassword(UserVO userVO);

    /**
     * 添加用户token
     *
     * @param id
     */
    void setTokenById(@Param("id") String id,@Param("token") String token);

    /**
     * 根据token获取用户
     *
     * @param token
     * @return
     */
    User getUserByToken(@Param("token") String token);
}
