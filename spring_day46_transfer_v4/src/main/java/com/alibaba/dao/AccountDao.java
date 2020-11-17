package com.alibaba.dao;

import com.alibaba.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/12 17:47
 * @Version 1.0
 */
public interface  AccountDao {
    void update(@Param("name") String name,@Param("money")Double money) ;
     List<Account> findAll();
    void up(@Param("name") String name,@Param("money")Double money) ;
}
