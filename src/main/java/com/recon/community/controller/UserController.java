package com.recon.community.controller;

import com.alibaba.fastjson.JSONObject;
import com.recon.community.entity.Residents;
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

import java.util.List;


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
    private UserService userService;

    @ApiOperation(value = "用户登陆", notes = "用户登陆", produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = "/login")
    public OptResult loginUser(@ApiParam(name = "userVO", value = "用户对象", required = true) @RequestBody @Validated UserVO userVO) {
        logger.info("用户登陆 userVO:" + JSONObject.toJSONString(userVO));
        OptResult result = new OptResult();
        User user = userService.login(userVO);
        result.setBody(user);
        return result;
    }

    @ApiOperation(value = "获取用户", notes = "获取用户", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "/get")
    public OptResult getUser() {
        logger.info("获取用户");
        OptResult result = new OptResult();
        Residents residents = userService.getUser();
        result.setBody(residents);
        return result;
    }

    @GetMapping("family/{id}")
    @ApiOperation(value = "获取家庭成员",notes = "获取家庭成员", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParam(name = "id", value = "居民id", paramType = "path", dataType = "String", required = true)
    public OptResult listFamily(@PathVariable String id) {
        logger.info("获取家庭成员 id" + id);
        OptResult result = new OptResult();
        List<Residents> residentsList = userService.listFamily(id);
        result.setBody(residentsList);
        return result;
    }

    @DeleteMapping("delete/{id}")
    @ApiOperation(value = "删除用户",notes = "删除用户", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParam(name = "id", value = "用户id", paramType = "path", dataType = "String", required = true)
    public OptResult deleteUser(@PathVariable String id) {
        logger.info("删除用户 id" + id);
        OptResult result = new OptResult();
        userService.delelteUser(id);
        return result;
    }

    @PutMapping("update/")
    @ApiOperation(value = "修改用户",notes = "修改用户", produces = MediaType.APPLICATION_JSON_VALUE)
    public OptResult updateUser(@RequestBody Residents residents) {
        logger.info("修改用户 residents:" + JSONObject.toJSONString(residents));
        OptResult result = new OptResult();
        userService.updateUser(residents);
        return result;
    }

    @PutMapping("add/")
    @ApiOperation(value = "添加用户",notes = "添加用户", produces = MediaType.APPLICATION_JSON_VALUE)
    public OptResult addUser(@RequestBody Residents residents) {
        logger.info("添加用户 residents:" + JSONObject.toJSONString(residents));
        OptResult result = new OptResult();
        userService.addUser(residents);
        return result;
    }



}
