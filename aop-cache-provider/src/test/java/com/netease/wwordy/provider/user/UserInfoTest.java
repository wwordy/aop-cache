package com.netease.wwordy.provider.user;

import com.netease.wwordy.api.user.UserInfo;
import com.netease.wwordy.api.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author liuwangwang@corp.netease.com
 * @date 2021/7/3
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:providerPerf.xml")
public class UserInfoTest {

    @Resource
    private UserService userService;

    @Test
    public void test(){
        UserInfo user = userService.getUser(1L);
        System.out.println(user);
    }
}
