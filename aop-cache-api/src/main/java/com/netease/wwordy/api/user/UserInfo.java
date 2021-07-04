package com.netease.wwordy.api.user;

import com.google.common.base.MoreObjects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author liuwangwang@corp.netease.com
 * @date 2021/7/3
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 7790375914611784095L;
    private Long id;
    private String username;
    private String password;
    private Integer age;
    private String phone;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .omitNullValues()
                .add("id", id)
                .add("username", username)
                .add("age", age)
                .add("phone", phone)
                .toString();
    }
}
