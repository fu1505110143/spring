package com.itheima;

import com.itheima.controller.AccountController;
import com.itheima.pojo.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @Author :fuwei
 * @Date:2020/11/10 17:58
 * @Version 1.0
 */
public class TestSpring {
    @Test
    public  void findAll(){
        ApplicationContext act=new ClassPathXmlApplicationContext ("spring.xml");
        AccountController accountController = (AccountController) act.getBean ("accountController");
        accountController.findAll ();
    }
    @Test
    public void findById() throws SQLException {
        ApplicationContext act=new ClassPathXmlApplicationContext ("spring.xml");
        AccountController accountController = (AccountController) act.getBean ("accountController");
        Account account = accountController.findByid (1);
        System.out.println (account);
    }
    @Test
    public void updateById() throws SQLException {
        ApplicationContext act=new ClassPathXmlApplicationContext ("spring.xml");
        AccountController accountController = (AccountController) act.getBean ("accountController");
        accountController.updateByid (new Account (1,"张三",2000));
    }
    @Test
    public void addAccount() throws SQLException {
        ApplicationContext act=new ClassPathXmlApplicationContext ("spring.xml");
        AccountController accountController = (AccountController) act.getBean ("accountController");
        accountController.addAccount (new Account (5,"张三",2000));
    }
    @Test
    public void deleteById() throws SQLException {
        ApplicationContext act=new ClassPathXmlApplicationContext ("spring.xml");
        AccountController accountController = (AccountController) act.getBean ("accountController");
        accountController.deleteByid (5);
    }


}
