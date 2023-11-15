package com.learn.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    
    @Around("execution(* com.learn.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info("Method will execute");
        joinPoint.proceed();
        logger.info("Method executed");

    }
}
