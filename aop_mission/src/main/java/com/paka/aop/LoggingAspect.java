package com.paka.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class LoggingAspect {

    @Pointcut("execution(* com.paka.aop.*Service.*(..))")
    public void logPointcut() {}

    @Before("com.paka.aop.LoggingAspect.logPointcut()")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("Before joinPoint.getTarget():" +joinPoint.getTarget() );

        if(joinPoint.getArgs().length> 0) {
            System.out.println("Before joinPoint.getArg()[0] :" +joinPoint.getArgs()[0]);
        }
    }
    @After("logPointcut()")
    public void logAfter(JoinPoint joinPoint ) {
        System.out.println("After joinPoint.getSignature() :" +joinPoint.getSignature());
    }

    @AfterReturning(pointcut =" logPointcut()",returning = "result")
    public void logAfterReturning(JoinPoint joinPoint,Object result) {
        System.out.println("After Returning result :" + result);
    }

    @AfterThrowing (pointcut = "logPointcut()", throwing = "exception" )
    public void logAfterThrowing(Throwable exception) {
        System.out.println("After Throwing exception :" + exception );
    }
}
