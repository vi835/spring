package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao() {
        System.out.println("工厂方法创建Bean对象 ...");
        return new UserDaoImpl();
    }
}
