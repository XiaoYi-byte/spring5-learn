package com.spring5.dao;

public class UserDaoImpl implements UserDao{
    public void setuName(String uName) {
        this.uName = uName;
    }

    private String uName;
    @Override
    public void add() {
        System.out.println("dao add........");
    }


}
