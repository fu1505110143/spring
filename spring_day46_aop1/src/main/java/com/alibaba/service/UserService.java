package com.alibaba.service;

import org.springframework.stereotype.Component;

/**
 * @Author :fuwei
 * @Date:2020/11/12 16:22
 * @Version 1.0
 */
public interface UserService {
    void add();
    void deleteById(int id);
    void update();
    String query();

}
