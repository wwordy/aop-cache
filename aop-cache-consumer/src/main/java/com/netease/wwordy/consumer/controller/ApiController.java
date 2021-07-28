package com.netease.wwordy.consumer.controller;

import com.netease.wwordy.api.user.UserInfo;
import com.netease.wwordy.consumer.user.UserInfoCheck;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/aop")
public class ApiController {

    static {
        System.out.println("1111111111111111111111111111");
    }
    @Resource
    private UserInfoCheck userInfoCheck;

    @RequestMapping("/user")
    @ResponseBody
    public UserInfo getUserInfo(Long id){
       return userInfoCheck.check(id);
    }
}
