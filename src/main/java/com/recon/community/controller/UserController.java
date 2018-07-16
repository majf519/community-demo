package com.recon.community.controller;

import com.alibaba.fastjson.JSONObject;
import com.recon.community.entity.User;
import com.recon.community.service.UserService;
import com.recon.community.vo.UserVO;
import com.recon.core.vo.OptResult;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


/**
 * @author daniel.xue
 * @create 2018/7/9
 **/
@RestController
@RequestMapping("/community/user/")
@Api(value = "用户接口", tags = "用户接口")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService dictService;

    @ApiOperation(value = "用户登陆", notes = "用户登陆", produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = "/login")
    public OptResult addDict(@ApiParam(name = "userVO", value = "用户对象", required = true) @RequestBody @Validated UserVO userVO) {
        logger.info("用户登陆 userVO:" + JSONObject.toJSONString(userVO));
        OptResult result = new OptResult();
        User user = dictService.login(userVO);
        result.setBody(user);
        return result;
    }

}
