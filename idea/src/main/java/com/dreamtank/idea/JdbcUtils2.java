package com.dreamtank.idea;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtils2 {
    @JdbcProperty(driverClass="com.mysql.jdbc.Driver",url="jdbc:mysql:///exam",user="root",password="abc")
    public static Connection
               getConnection() throws ClassNotFoundException, SQLException {
        Class clazz = JdbcUtils2.class;
        //Method method = clazz.getDeclaredMethod("getConnection");
        JdbcProperty jp = (JdbcProperty)clazz.getAnnotation(JdbcProperty.class);
        String driverClass=jp.driverClass();
        String url=jp.url();
        String user=jp.user();
        String password=jp.password();
        Class.forName(driverClass);
        Class.forName("");
        Connection con= DriverManager.getConnection(url, user,password);

        return con;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, SQLException{
        Connection connection = getConnection();
        ResultSet rs = connection.createStatement().executeQuery("select * from user");
        if (rs.next()) {
            System.out.println(rs.getString("username"));
        }
    }
}
