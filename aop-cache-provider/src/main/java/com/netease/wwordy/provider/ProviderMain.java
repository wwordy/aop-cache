package com.netease.wwordy.provider;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liuwangwang@corp.netease.com
 * @date 2021/7/3
 */

@Slf4j
public class ProviderMain {
    public static void main(String[] args) {
    /**
     * 自动加载META-INF/spring目录下的所有Spring配置
     * 可以在dubbo.properties文件中指定要加载的spring文件位置,dubbo.properties文件名不能修改
     * dubbo.spring.config=classpath*:META-INF/spring/*.xml ----配置spring配置加载位置
     * 本程序中指定一个spring主配置文件, 其他配置文件通过主配置文件import
     */
        log.info("aop-cache-provider 服务启动...");
        org.apache.dubbo.container.Main.main(args);
    }

}
