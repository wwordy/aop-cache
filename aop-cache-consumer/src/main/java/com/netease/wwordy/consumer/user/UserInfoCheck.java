package com.netease.wwordy.consumer.user;

import com.netease.wwordy.api.user.UserInfo;
import com.netease.wwordy.api.user.UserService;
import com.netease.wwordy.consumer.base.BaseCheck;
import io.vavr.control.Try;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author liuwangwang@corp.netease.com
 * @date 2021/7/4
 */
@Slf4j
@Component("userInfoCheck")
public class UserInfoCheck implements BaseCheck<UserInfo,Long> {

    @Resource
    private UserService userService;

    @Override
    public UserInfo check(Long id) {

        return Try.of(()->userService.getUser(id))
                .onFailure(e->log.error("UserInfoCheck exception!!! userId={}",id,e)).getOrNull();
    }
}
