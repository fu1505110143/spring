package com.alibaba.service.impl;

import com.alibaba.dao.AccountDao;
import com.alibaba.pojo.Account;
import com.alibaba.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/12 17:49
 * @Version 1.0
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private DataSource dataSource;
    @Override
    public void update(String fromName,String toName,Double money) {
                accountDao.update (fromName,-money);
//                int n=10/0;
                accountDao.update (toName,money);
    }
    @Override
    public void up(String fromName,String toName,Double money) {
        accountDao.up (fromName,-money);
//        int n=10/0;
        accountDao.up (toName,money);
    }
    @Override
    public List<Account> findAll() {
       return accountDao.findAll ();
    }
}
