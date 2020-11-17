package com.itheima.service;

import com.itheima.pojo.Account;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/10 17:32
 * @Version 1.0
 */
public interface AccountService {
    List<Account> findAll() throws SQLException;

    Account findById(int id) throws SQLException;

    void updateById(Account account) throws SQLException;

    void deleteById(int id) throws SQLException;

    void addAccount(Account account) throws SQLException;
}
