package com.alibaba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

/**
 * @Author :fuwei
 * @Date:2020/11/14 16:51
 */
@Controller
public class HelloController {

    @RequestMapping("/hello/world")
    public String sayHello() {
        System.out.println ("hello world");
        return "success";
    }
}
