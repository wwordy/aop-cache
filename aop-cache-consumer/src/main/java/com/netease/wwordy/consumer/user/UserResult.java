package com.netease.wwordy.consumer.user;

import com.netease.wwordy.api.user.UserInfo;
import com.netease.wwordy.api.user.UserService;
import com.netease.wwordy.consumer.base.BaseCheck;

import javax.annotation.Resource;

/**
 * @author liuwangwang@corp.netease.com
 * @date 2021/7/4
 */

public class UserResult implements BaseCheck<UserInfo> {

    @Resource
    private UserService userService;

    @Override
    public UserInfo check() {
        return userService.getUser(1L);
    }
}
