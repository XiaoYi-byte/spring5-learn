package com.spring5.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//完全注解开发
@Configuration //作为配置类，替换xml配置文件
@ComponentScan(basePackages = {"com.spring5"}) //组件扫描
@EnableAspectJAutoProxy(proxyTargetClass = true)//开启AspectJ  替代<aop:aspectj-autoproxy></aop:aspectj-autoproxy>
public class SpringConfig {

}
