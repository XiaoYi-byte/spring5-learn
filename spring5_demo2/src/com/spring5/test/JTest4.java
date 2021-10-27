package com.spring5.test;

import com.spring5.service.BookService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//指定使用的单元测试框架
@ContextConfiguration("classpath:bean1.xml")//加载配置文件
//作用类似于ApplicationContext context1 = new ClassPathXmlApplicationContext();
public class JTest4 {

    @Autowired
    private BookService bookService;
}
