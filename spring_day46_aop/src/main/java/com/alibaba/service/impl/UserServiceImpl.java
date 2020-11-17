package com.alibaba.service.impl;

import com.alibaba.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author :fuwei
 * @Date:2020/11/12 16:22
 * @Version 1.0
 */
@Service
public class UserServiceImpl  implements UserService {
    @Override
    public void add() {
        System.out.println("执行添加...");
        int number = 10/0;
    }

    @Override
    public void deleteById(int id) {
        //删除了id为
        System.out.println("执行删除..."+id);
    }

    @Override
    public void update() {
        System.out.println("执行修改...");
    }

    @Override
    public String query() {
        try {
            Thread.sleep(3000);
            System.out.println("执行查询...");
            return "张三";
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }
}
