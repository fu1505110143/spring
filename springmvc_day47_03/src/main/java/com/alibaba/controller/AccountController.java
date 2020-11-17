package com.alibaba.controller;

import com.alibaba.pojo.Account;
import com.alibaba.pojo.Result;
import com.alibaba.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/14 19:40
 */

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
   private AccountService accountService;
    @RequestMapping("/addAccount")
    public Result addAccount(@RequestBody Account account){
        try {
            accountService.addAccount(account);
            return  new Result (true,null,"添加成功");
        } catch (Exception e) {
            e.printStackTrace ();
            return  new Result (false,null,"添加失败");
        }
    }
    @RequestMapping("/find")
    public Result findAll(){
        try {
           List<Account> accountList =accountService.findAll();
            return  new Result (true,accountList,"查询成功");
        } catch (Exception e) {
            e.printStackTrace ();
            return  new Result (false,null,"查询失败");
        }
    }
    @RequestMapping(value = "/{id}")
    public Result deleteById(@PathVariable("id") int id){
        try {
            accountService.delete(id);
            return  new Result (true,null,"删除成功");
        } catch (Exception e) {
            e.printStackTrace ();
            return  new Result (false,null,"删除失败");
        }
    }
}
