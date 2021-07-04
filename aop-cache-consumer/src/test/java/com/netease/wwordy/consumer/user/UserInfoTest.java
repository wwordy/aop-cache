package com.netease.wwordy.consumer.user;

import com.netease.wwordy.api.user.UserInfo;
import com.netease.wwordy.api.user.UserService;
import com.netease.wwordy.consumer.base.BaseCheck;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author liuwangwang@corp.netease.com
 * @date 2021/7/4
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
public class UserInfoTest {

    @Resource
    private BaseCheck<UserInfo> baseCheck;
    @Test
    public void test(){
        UserInfo check = baseCheck.check();
        System.out.println(check);
    }
}
