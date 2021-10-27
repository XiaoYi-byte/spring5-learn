package com.AOPAnno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)//多个增强类对方法增强时设置增强方法的优先级，值越小优先级越高
public class PersonProxy {
    //优先级越高执行越早
    @Before(value = "execution(* com.AOPAnno.User.add(..))")
    public void before(){
        System.out.println("person before ...");
    }
    //优先级越高执行越晚
    @After(value = "execution(* com.AOPAnno.User.add(..))")
    public void after(){
        System.out.println("person after ...");
    }
}
