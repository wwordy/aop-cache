package com.netease.wwordy.provider.user;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 基础mapper注解，添加此注解会被mybatis自动封装
 * 扫描器配置在base-application-context-db.xml
 */
@Target(ElementType.TYPE)
public @interface MyBatisMapper {
}
