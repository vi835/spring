package com.itheima.demo;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDemo {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserDao userDao = (UserDao) app.getBean("userDao");
        // 通过类名获取Bean对象不需要强转
        UserDao userDao = app.getBean(UserDao.class);
        userDao.save();
    }
}
