package com.AOPxml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXML {
    @Test
    public void testXML(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aop2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
