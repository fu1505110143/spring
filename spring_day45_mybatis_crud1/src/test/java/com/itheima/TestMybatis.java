package com.itheima;

import com.itheima.controller.AccountController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;


/**
 * @Author :fuwei
 * @Date:2020/11/11 17:27
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class TestMybatis {

    /**
     * 包名:com.itheima.test
     *
     * @author Leevi
     * 日期2020-08-09  15:16
     * 直接在测试用例中，注入要使用的对象AccountController
     * 1. 我们自己不创建核心容器，那么我们就应该交给别人(Junit)去创建核心容器
     * 1. 引入spring整合Junit的依赖  spring-test
     * 2. 保证Junit的版本是4.12以及以上的版本
     * 3. 在单元测试类上添加RunWith注解
     * @RunWith(SpringJUnit4ClassRunner.class) 4. 指定有Junit创建核心容器的时候，要加载的配置文件/配置类
     * @ContextConfiguration(locations = "classpath:applicationContext.xml") 混合开发
     * @ContextConfiguration(classes = 配置类名.class) 纯注解开发
     */
    @Autowired
    private AccountController accountController;
@Test
    public void findAll() throws SQLException {
        System.out.println (accountController.findAll ());
    }
}
