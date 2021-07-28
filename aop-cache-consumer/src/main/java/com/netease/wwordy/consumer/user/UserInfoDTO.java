package com.netease.wwordy.consumer.user;

import com.google.common.base.MoreObjects;
import com.netease.wwordy.api.user.UserInfo;
import com.netease.wwordy.consumer.aspect.CheckResult;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDTO extends CheckResult {
    private UserInfo userInfo;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .omitNullValues()
                .add("userInfo", userInfo)
                .add("super", super.toString())
                .toString();
    }
}
