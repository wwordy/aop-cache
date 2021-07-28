package com.netease.wwordy.consumer.aspect;

import com.google.common.base.Stopwatch;
import com.netease.wwordy.api.user.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author liuwangwang@corp.netease.com
 * @date 2021/7/4
 */
@Slf4j
@Aspect
@Component(value = "checkServiceAdvice")
public class CheckServiceAdvice {

    @Around("execution(* com.netease.wwordy.consumer..*Check(..))")
    public UserInfo checkAdvice(ProceedingJoinPoint pjp) throws Throwable {
        Stopwatch sw = Stopwatch.createStarted();
        Long params = (Long)pjp.getArgs()[0];
        Method targetMethod = getTargetMethod(pjp);
       /* EnableCheckCache cacheAnnotation = Try.of(() -> targetMethod.getAnnotation(EnableCheckCache.class))
                .onFailure(e -> log.error("Get EnableCheckCache exception !!!", e)).getOrNull();
        UserInfo userInfo = (null == cacheAnnotation)? (UserInfo)pjp.proceed():*/
        UserInfo userInfo =(UserInfo) pjp.proceed();
        log.info("{} CHECK FINISH,params={},result={}", pjp.getTarget().getClass().getSimpleName(), params, userInfo);
        return userInfo;
    }

    private Method getTargetMethod(JoinPoint point){
        try {
            MethodSignature signature = (MethodSignature) point.getSignature();
            return point.getTarget().getClass().getDeclaredMethod(signature.getName(),signature.getParameterTypes());
        } catch (NoSuchMethodException e) {
            log.error("getTargetMethod exception!!! point={},", point, e);
            return null;
        }
    }
}
