package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

/**
 * @Author :fuwei
 * @Date:2020/11/10 16:18
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private Integer age;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String getName() {
        System.out.println (userDao.getAge ());
        System.out.println (age);
        return "喵喵";

    }
}
