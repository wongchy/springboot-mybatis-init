package com.aus.system.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author WongChy
 * @Date 2020/10/25 17:40
 */
@Slf4j
@Aspect
@Component
public class AutoLogAspect {

    @Pointcut("@annotation(com.aus.common.aspect.annotation.AutoLog)")
    public void logPointCut() {}

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object result = point.proceed();
        log.info("==={}","eee");
        return result;
    }

}
