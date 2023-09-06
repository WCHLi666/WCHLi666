package com.atguigu.imperial.court.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mysql.jdbc.Connection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.sql.DataSource;

public class JDBCUtils {
    private static DataSource dataSource;
    static{
        try {
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            InputStream stream = classLoader.getResourceAsStream("jdbc.properties");
            Properties properties = new Properties();
            properties.load(stream);
            DataSource dataSource1 = DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection(){
        return null;
    }
}
