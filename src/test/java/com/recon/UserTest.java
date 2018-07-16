package com.recon;

import com.recon.community.Application;
import com.recon.community.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author daniel.xue
 * @create 2018/7/16
 **/
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void getUserByToken(){
        System.out.println(userService.getUserByToken("token"));
    }
}
