package com.dreamtank.idea;

import com.mchange.v2.c3p0.ComboPooledDataSource;
public class JdbcUtils1 {
    private static ComboPooledDataSource ds=new ComboPooledDataSource();
    public static DataSource getDataSource(){
    return ds;
    }
    public static Connection getConnection() throws SQLException{
        return ds.getConnection();
    }
}
