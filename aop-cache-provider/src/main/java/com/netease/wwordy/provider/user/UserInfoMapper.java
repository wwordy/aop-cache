package com.netease.wwordy.provider.user;


import com.netease.wwordy.api.user.UserInfo;
import org.apache.ibatis.annotations.Select;

@MyBatisMapper
interface UserInfoMapper {
    //@Select("SELECT * FROM user_info where id = #{id}")
    UserInfo getUser(Long id);
}
