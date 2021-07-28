package com.netease.wwordy.consumer.base;

/**
 * @author liuwangwang@corp.netease.com
 * @date 2021/7/4
 */
public interface BaseCheck<Result,Param> {
    Result check(Param param);
}
