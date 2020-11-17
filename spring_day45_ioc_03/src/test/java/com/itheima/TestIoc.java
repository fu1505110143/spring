package com.itheima;

import com.itheima.utils.DruidUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author :fuwei
 * @Date:2020/11/10 16:49
 * @Version 1.0
 */
public class TestIoc {
    @Test
    public void test01() throws SQLException {
        //目标: 通过DruidUtil2获取dataSource对象,并且将获取到的dataSource对象交给spring管理
        //DruidUtil2 druidUtil2 = new DruidUtil2();
        //DataSource dataSource = druidUtil2.getDataSource();
      ApplicationContext act=new ClassPathXmlApplicationContext("spring.xml");
        DataSource dataSource= (DataSource) act.getBean ("dataSource");
        Connection connection = dataSource.getConnection ();
    }

}
