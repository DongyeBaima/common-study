package com.study.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TestAspect {

    public void doThrowing(JoinPoint jp, Throwable ex) {
        System.out.println(jp.getTarget().getClass().getSimpleName());
        System.out.println(jp.getSignature());

        System.out.println(jp.getSignature().toShortString());

//        System.out.println("    --  @异常处理   --  " + jp.getTarget().getClass().getSimpleName() + "." + jp.getSignature() + "(" + jp.getArgs()[0] + ")");
        if ("foooo".equals(jp.getSignature().getName()))
            throw new RuntimeException("---------------     新异常 ");
    }

    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {

        Object retVal = null;
        try {
            retVal = pjp.proceed();
        } catch (Throwable throwable) {
            System.out.println(pjp.getTarget().getClass().getSimpleName());
            System.out.println(pjp.getSignature().getName());
//            throw new RuntimeException();
        }


        return null;
    }


} 