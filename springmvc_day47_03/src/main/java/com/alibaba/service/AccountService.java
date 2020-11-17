package com.alibaba.service;

import com.alibaba.pojo.Account;

import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/14 19:41
 */
public interface AccountService {
    void addAccount(Account account);
    List<Account> findAll();
    void delete(int id);
}
