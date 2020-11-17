package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.pojo.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/11 17:14
 * @Version 1.0
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() throws SQLException {
        return accountDao.findAll ();
    }

    @Override
    public Account findById(int id) throws SQLException {
        return accountDao.findById (id);
    }

    @Override
    public void updateById(Account account) throws SQLException {
        accountDao.updateById (account);
    }

    @Override
    public void deleteById(int id) throws SQLException {
        accountDao.deleteById (id);
    }

    @Override
    public void addAccount(Account account) throws SQLException {
        accountDao.addAccount (account);
    }
}
