package com.AOPAnno.test;

import com.AOPAnno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        User user = context.getBean("user",User.class);
        user.add();
    }
}
