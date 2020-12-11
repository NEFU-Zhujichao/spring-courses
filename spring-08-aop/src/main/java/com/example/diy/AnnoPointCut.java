package com.example.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
//交给Spring管理这个类 就是配置了一个bean
@Component
//使用注解开启自动代理配置
@EnableAspectJAutoProxy
public class AnnoPointCut {
    @Pointcut("execution(* com.example.service.UserServiceImpl.*(..))")
    public void pointcut(){}
    @Before("pointcut()")
    public void before(){
        System.out.println("=======方法执行前============");
    }
    @After("pointcut()")
    public void after(){
        System.out.println("=======方法执行后============");
    }
    @Around("pointcut()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Signature signature = jp.getSignature();
        System.out.println(signature.getName());
        System.out.println(signature);
        jp.proceed();
        System.out.println("环绕后");
    }
}
