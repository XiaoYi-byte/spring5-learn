package com.spring5.annotation;

import org.springframework.stereotype.Repository;

@Repository(value = "myDaoImpl1")
public class MyDaoImpl implements MyDao{
    @Override
    public void add() {
        System.out.println("dao add ....");
    }
}
