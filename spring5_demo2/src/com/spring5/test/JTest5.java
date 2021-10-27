package com.spring5.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean1.xml")

//复合注解，替代上面两个注解,Spring5对Junit5引入的新注解
@SpringJUnitConfig(locations = "classpath:bean1.xml")
public class JTest5 {
    @Test
    public void test(){

    }

}
