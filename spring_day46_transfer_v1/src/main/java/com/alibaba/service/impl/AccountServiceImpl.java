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
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager ();
        dataSourceTransactionManager.setDataSource (dataSource);
        TransactionTemplate transactionTemplate = new TransactionTemplate ();
        transactionTemplate.setTransactionManager (dataSourceTransactionManager);
        transactionTemplate.execute (new TransactionCallback<Object> () {
            @Override
            public Object doInTransaction(TransactionStatus transactionStatus) {
                accountDao.update (fromName,-money);
//                int n=10/0;
                accountDao.update (toName,money);
                return null;
            }
        });
    }

    @Override
    public List<Account> findAll() {
       return accountDao.findAll ();
    }
}
