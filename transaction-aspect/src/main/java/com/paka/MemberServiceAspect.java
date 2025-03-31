package com.paka;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


import org.springframework.stereotype.Component;


@Aspect //aop의 기능을 제공
@Component // 빈등록
public class MemberServiceAspect {

    @Pointcut("execution(* com.paka.*Service.*(..))")  //특정 메소드 또는 메서드 패턴을 선택하여 Advice를 적용할 대상을 정의
    public void logPointcut() {
    }

    @Before("MemberServiceAspect.logPointcut()") //  Pointcut에 해당하는 메서드가 실행되기전에 실행
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before joinPoint.getTarget() :" + joinPoint.getTarget());

        if (joinPoint.getArgs().length > 0) {  //조인포인트 인자개수가 0보다 크면 실행
            System.out.println("Before joinPoint.getArg()[0] :" + joinPoint.getArgs()[0]);
        }

    }

    @After("logPointcut()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After joinPoint.getSignature() : " + joinPoint.getSignature());
    }

    @AfterReturning(pointcut = "logPointcut()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("After Returning result : " + result);
    }

    @AfterThrowing(pointcut = "logPointcut()", throwing = "exception")
    public void logAfterThrowing(Throwable exception) {
        System.out.println("After Throwing exception : " + exception);
    }


}



