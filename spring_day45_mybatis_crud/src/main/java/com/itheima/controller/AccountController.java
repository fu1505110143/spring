package com.itheima.controller;

import com.itheima.pojo.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/11 17:12
 * @Version 1.0
 */
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    public List<Account> findAll() throws SQLException {
       return accountService.findAll ();
    };

    public Account findById(int id) throws SQLException{
         return accountService.findById (id);
    };

    public void updateById( Account account) throws SQLException{
        accountService.updateById (account);
    };

    public void deleteById(int id) throws SQLException{
        accountService.deleteById (id);
    };

    public void addAccount(Account account) throws SQLException{
        accountService.addAccount (account);

    };
}
