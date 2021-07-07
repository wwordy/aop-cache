package com.netease.wwordy.provider.user;

import com.netease.wwordy.api.user.UserInfo;
import com.netease.wwordy.api.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author liuwangwang@corp.netease.com
 * @date 2021/7/3
 */
@Slf4j
@Component(value = "userInfoServiceImpl")
public class UserServiceImpl implements UserService {

    @Resource
    private UserInfoMapper userInfoMapper;
   static {
       System.out.println("---------------------------------------");
   }
    @Override
    public UserInfo getUser(Long id) {
        log.info("请求的用户id={}", id);
        UserInfo user = userInfoMapper.getUser(id);
        return user;
    }
}
