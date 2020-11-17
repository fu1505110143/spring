package com.alibaba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author :fuwei
 * @Date:2020/11/15 17:34
 */
@Controller
public class myController {
    @RequestMapping("/find/get")
    public void find(){
        System.out.println ("mycontroller");
    }
}
