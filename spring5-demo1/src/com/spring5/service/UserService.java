package com.spring5.service;

import com.spring5.dao.UserDao;
import com.spring5.dao.UserDaoImpl;

public class UserService {
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;
    private UserDaoImpl userDaoImpl;

    public UserDaoImpl getUserDaoImpl() {
        return userDaoImpl;
    }

    public void add(){
        System.out.println("service add........");
        userDao.add();
    }
}
