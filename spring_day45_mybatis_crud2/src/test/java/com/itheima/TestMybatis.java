package com.itheima;

import com.itheima.controller.AccountController;
import com.itheima.service.SpringConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;


/**
 * @Author :fuwei
 * @Date:2020/11/11 17:27
 * @Version 1.0
 */
public class TestMybatis {
    @Test
    public void findAll() throws SQLException {
        ApplicationContext act=new AnnotationConfigApplicationContext (SpringConfiguration.class);
        AccountController accountController = (AccountController) act.getBean ("accountController");
        System.out.println (accountController.findAll ());
    }
}
