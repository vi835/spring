package com.itheima.controller;

import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();

        /**
         * 不是Spring容器托管的Bean对象 没有注入UserDao
         */
//        UserService userService1=new UserServiceImpl();
//        userService1.save();
    }
}
