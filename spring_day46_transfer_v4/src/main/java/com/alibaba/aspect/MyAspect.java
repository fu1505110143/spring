package com.alibaba.aspect;

import org.springframework.stereotype.Component;

/**
 * @Author :fuwei
 * @Date:2020/11/12 20:16
 * @Version 1.0
 */
@Component
public class MyAspect {
    public void checkPermission(){
        System.out.println ("进行权限校验");
    }
}
