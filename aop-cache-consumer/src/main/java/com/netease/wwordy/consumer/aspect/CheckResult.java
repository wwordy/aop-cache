package com.netease.wwordy.consumer.aspect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author liuwangwang@corp.netease.com
 * @date 2021/7/4
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CheckResult<T> {

    private T data;
}
