package com.alibaba;

import com.alibaba.service.UserService;
import com.alibaba.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author :fuwei
 * @Date:2020/11/12 16:44
 * @Version 1.0
 */
@RunWith (SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:spring-aop.xml" )
public class TestAop {
    @Autowired
    private UserService userService;
   @Test
    public void add(){
        userService.add ();
    }
    @Test
    public void query(){
        userService.query ();
    }
    @Test
    public void error(){
        userService.add ();
    }
}
