package com.itheima;

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
        ApplicationContext act = new ClassPathXmlApplicationContext ("spring.xml");
        DataSource dataSource = (DataSource) act.getBean ("dataSource");
        Connection connection = dataSource.getConnection ();
    }

}
