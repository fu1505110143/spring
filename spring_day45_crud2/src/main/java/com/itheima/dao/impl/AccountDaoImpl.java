package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.pojo.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/10 17:32
 * @Version 1.0
 */
@Component
public class AccountDaoImpl implements AccountDao {

    private QueryRunner queryRunner;

    public AccountDaoImpl(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    @Override
    public List<Account> findAll() throws SQLException {
        String sql = "select * from account";
        List<Account> accountList = queryRunner.query (sql, new BeanListHandler<> (Account.class));
        return accountList;
    }

    @Override
    public Account findById(int id) throws SQLException {
        String sql = "select * from account where id=?";
        Account account = queryRunner.query (sql, new BeanHandler<> (Account.class), id);
        return account;
    }

    @Override
    public void updateById(Account account) throws SQLException {
        String sql = "update account set name=? ,money=? where id=?";
        queryRunner.update (sql, account.getName (), account.getMoney (), account.getId ());
    }

    @Override
    public void deleteById(int id) throws SQLException {
        String sql = "delete from account  where id=?";
        queryRunner.update (sql,id);
    }

    @Override
    public void addAccount(Account account) throws SQLException {
        String sql = "insert into account  values(null,?,?)";
        queryRunner.update (sql, account.getName (), account.getMoney ());
    }
}
