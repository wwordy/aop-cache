package com.netease.wwordy.provider.user;


import com.netease.wwordy.api.user.UserInfo;
import org.springframework.stereotype.Repository;

interface UserInfoMapper {
    //@Select("SELECT * FROM user_info where id = #{id}")
    UserInfo getUser(Long id);
}
