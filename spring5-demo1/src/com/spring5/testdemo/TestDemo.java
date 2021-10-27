package com.spring5.testdemo;

import com.spring5.User;
import com.spring5.annotation.MyService;
import com.spring5.annotation.SpringConfig;
import com.spring5.collectionType.Course;
import com.spring5.collectionType.Student;
import com.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class TestDemo {

    @Test
    public void testAdd() {

        /*1、IOC思想基于IOC容器完成，IOC容器底层就是对象工厂。
          2、Spring提供IOC容器实现两种方式:(两个接口)。
            (1) BeanFactory:IOC容器基本实现，是Spring内部的使用接口，不提供开发人员进行使用,

                不同：加载配置文件时候不会创建对象，在获取对象(使用)才去创建对象↵
            (2) ApplicationContext: BeanFactory接口的子接口，提供更多更强大的功能，一般由开发人员进行使用

                    加载配置文件时候就会把在配置文件对象进行创建
           3、ApplicationContext接口有实现类.
              主要的两个：ClassPathXmlApplicationContext、FileSystemXmlApplicationContext
*/

        //加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        //获取配置创建的对象
        UserService userService = context.getBean("userService",UserService.class);
        userService.add();

    }

    /*注入集合*/
    @Test
    public void testCollection(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean4.xml");
        Student student=context.getBean("stu",Student.class);
        System.out.println(student);
    }

    /*注解测试*/
    @Test
    public void testAnnotation(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean7.xml");
        MyService myService=context.getBean("myService", MyService.class);
        myService.add();
    }

    /*完全注解开发*/
    @Test
    public void testConfig(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        MyService myService=context.getBean("myService", MyService.class);
        myService.add();
    }
}
