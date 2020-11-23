package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }


    public UserServiceImpl(UserDao userDao) {
        System.out.println("有参构造注入 ...");
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    public void save() {
        userDao.save();
    }
}
