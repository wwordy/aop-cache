package com.netease.wwordy.consumer.aspect;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Component
public @interface EnableCheckCache {
    /**
     * check service type
     */
    String serviceType() default "${check.cache.service.type}";

    /**
     * check service group
     */
    String serviceGroup() default "${check.cache.service.group}";

    /**
     * check cache version
     */
    String dataVersion() default "${check.cache.data.version}";

    /**
     * check cache env
     */
    String dataEnv() default "${check.cache.data.env}";
}
