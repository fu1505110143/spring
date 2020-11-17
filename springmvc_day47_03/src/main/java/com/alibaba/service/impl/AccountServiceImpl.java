package com.alibaba.service.impl;

import com.alibaba.dao.AccountDao;
import com.alibaba.pojo.Account;
import com.alibaba.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/14 19:41
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public void addAccount(Account account) {
        accountDao.addAccount(account);
    }

    @Override
    public List<Account> findAll() {
        return  accountDao.findAll();
    }

    @Override
    public void delete(int id) {
       accountDao.dalete(id);
    }
}
