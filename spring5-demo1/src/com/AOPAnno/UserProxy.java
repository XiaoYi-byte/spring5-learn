package com.AOPAnno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect//生成代理类的对象
@Order(3)
public class UserProxy {

    //抽取相同切入点
    @Pointcut(value = "execution(* com.AOPAnno.User.add(..))")
    public void pointDemo(){

    }
    //切入点表达式  execution([权限修饰符][返回类型][类全路径][方法名][参数列表])
    //前置通知
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before....");
    }

    //最终通知，方法执行后执行，有异常也会执行，类似try-catch中的finally
    @After(value = "execution(* com.AOPAnno.User.add(..))")
    public void after(){
        System.out.println("After....");
    }

    //后置通知，方法返回结果后执行，出现异常则不执行
    @AfterReturning(value = "execution(* com.AOPAnno.User.add(..))")
    public void afterReturning(){
        System.out.println("AfterReturning....");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.AOPAnno.User.add(..))")
    public void afterThrowing(){
        System.out.println("AfterThrowing....");
    }

    //环绕通知
    @Around(value = "execution(* com.AOPAnno.User.add(..))")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前....");
        //执行被增强的方法
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后....");
    }
}
