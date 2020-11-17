package com.itheima.dao;

import com.itheima.pojo.Account;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/11 17:12
 * @Version 1.0
 */
public interface AccountDao {
    List<Account> findAll() throws SQLException;

    Account findById(int id) throws SQLException;

    void updateById( Account account) throws SQLException;

    void deleteById(int id) throws SQLException;

    void addAccount(Account account) throws SQLException;
}
