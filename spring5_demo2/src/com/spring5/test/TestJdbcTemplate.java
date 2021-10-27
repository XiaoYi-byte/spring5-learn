package com.spring5.test;

import com.spring5.entity.Book;
import com.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class TestJdbcTemplate {
    @Test
    public void test(){
        Book book = new Book();
        book.setId("1");
        book.setName("Java");
        book.setStatus("a");
        System.out.println(book);
    }

    @Test
    public void test1(){
        /*@Nullable：用在属性上、方法上（方法返回值可以为空）、方法的参数上，为空即为不写*/

        //函数式风格创建对象，交给spring进行管理

        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        context.registerBean("userLog",UserLog.class,()->new UserLog());
//        registerBean中的第一个参数是@Nullable，可以省略不写
//        需要通过context.getBean("com.spring5.test.UserLog")获得对象
        UserLog userLog = (UserLog)context.getBean("userLog");
    }
}
