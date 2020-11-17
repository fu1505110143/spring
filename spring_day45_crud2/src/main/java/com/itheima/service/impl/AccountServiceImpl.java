package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.pojo.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.sql.SQLException;
import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/10 17:33
 * @Version 1.0
 */
@Component
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAll() throws SQLException {
        List<Account> accountList = accountDao.findAll ();
        return accountList;
    }

    @Override
    public Account findById(int id) throws SQLException {
        Account account = accountDao.findById (id);
        return account;
    }

    @Override
    public void updateById(Account account) throws SQLException {
        accountDao.updateById(account);
    }

    @Override
    public void deleteById(int id) throws SQLException {
        accountDao.deleteById(id);
    }

    @Override
    public void addAccount(Account account) throws SQLException {
        accountDao.addAccount(account);
    }
}
