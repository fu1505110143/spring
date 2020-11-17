package com.alibaba;

import com.alibaba.controller.AccountController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class Test01 {

    /**
     * @RunWith(SpringJUnit4ClassRunner.class) 4. 指定有Junit创建核心容器的时候，要加载的配置文件/配置类
     * @ContextConfiguration(locations = "classpath:applicationContext.xml") 混合开发
     * @ContextConfiguration(classes = 配置类名.class) 纯注解开发
     */
    @Autowired
    private AccountController accountController;

    @Test
    public void update() {
        accountController.update ("张三", "李四", 200.0);
    }
    @Test
    public void find(){
        System.out.println (accountController.findAll ());;
    }
}
