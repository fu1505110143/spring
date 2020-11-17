package com.alibaba.service;

import com.alibaba.dao.AccountDao;
import com.alibaba.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/12 17:49
 * @Version 1.0
 */
@Service
public interface AccountService {
    void update(String fromName,String toName,Double money);
    List<Account> findAll();
    void up(String fromName,String toName,Double money);
}
