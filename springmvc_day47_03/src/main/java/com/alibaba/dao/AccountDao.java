
package com.alibaba.dao;

import com.alibaba.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/14 19:40
 */
public interface AccountDao {
    List<Account> findAll();

    void dalete(int id);

    void addAccount( Account account);
}
