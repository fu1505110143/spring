package com.itheima.service;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Map;

/**
 * @Author :fuwei
 * @Date:2020/11/11 17:42
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages ="com.itheima")
public class SpringConfiguration {
    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource ();
        driverManagerDataSource.setUsername ("root");
        driverManagerDataSource.setUrl ("jdbc:mysql:///day27?CharaterEncoding=utf8");
        driverManagerDataSource.setPassword ("123456");
        driverManagerDataSource.setDriverClassName ("com.mysql.jdbc.Driver");
        return driverManagerDataSource;
    }
    @Bean
    public SqlSessionFactoryBean  getSqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean ();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage ("com.itheima.pojo");
        return sqlSessionFactoryBean;
    }
    @Bean
    public MapperScannerConfigurer getscannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer ();
        mapperScannerConfigurer.setBasePackage ("com.itheima.dao");
        return mapperScannerConfigurer;
    }
}
