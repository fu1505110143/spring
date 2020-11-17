package com.alibaba.controller;

import com.alibaba.pojo.Account;
import com.alibaba.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/12 17:54
 * @Version 1.0
 */
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    public void update(String fromName,String toName,Double money){
        accountService.update (fromName,toName,money);
    }

    public List<Account> findAll(){

        return  accountService.findAll ();
    }
    public void up(String fromName,String toName,Double money){
        accountService.up (fromName,toName,money);
    }
}
