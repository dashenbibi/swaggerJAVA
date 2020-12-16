package com.example.demo.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.example.demo.model.BaseResponse;
import com.example.demo.model.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping(value = "/eolinker")
@Api(value="eolinker", tags = "用户管理")
class UserController{

    @ApiOperation(value="用户登录", notes="通过账号密码进行用户登录")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "form", name = "userName", dataType = "String", required = true, value = "用户账号"),
            @ApiImplicitParam(paramType = "form", name = "password", dataType = "String", required = true, value = "用户密码"),
    })

    @RequestMapping(value="/user/login", method=RequestMethod.POST)
    public BaseResponse Login(String userName, String password) {
        BaseResponse u = new BaseResponse();
        return u;
    }


    @ApiOperation(value="用户注册", notes="通过邮箱进行用户注册")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", name = "userMail", dataType = "String", required = true, value = "用户邮箱"),
            @ApiImplicitParam(paramType = "body", name = "password", dataType = "String", required = true, value = "用户密码"),
    })

    @RequestMapping(value="/user/resister", method=RequestMethod.POST)
    public BaseResponse<User> Resister(String userMail, String password) {
        BaseResponse u = new BaseResponse<User>();
        return u;
    }
}