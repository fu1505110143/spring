package com.itheima.controller;

import com.itheima.pojo.Account;
import com.itheima.service.AccountService;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/10 17:41
 * @Version 1.0
 */
public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    public void findAll(){
        try {
            List<Account> accountList = accountService.findAll ();
            System.out.println (accountList);;
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }
    public Account findByid(int id) throws SQLException {
       Account account=accountService.findById(id);
       return account;
    }
    public void updateByid(Account account) throws SQLException {
       accountService.updateById(account);

    }
    public void deleteByid(int id) throws SQLException {
       accountService.deleteById(id);
    }
    public void addAccount(Account account) throws SQLException {
       accountService.addAccount(account);
    }
}
