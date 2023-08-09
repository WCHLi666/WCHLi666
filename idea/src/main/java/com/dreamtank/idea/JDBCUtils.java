package com.dreamtank.idea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtils {
    private static final String driverClassName;
    private static final String url;
    private static final String username;
    private static final String password;

    static{
        Properties properties = new Properties();
        try{
            properties.load(new FileReader("src/db.properties"));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        properties.getProperty("driverClassName");
        properties.getProperty("url");
        properties.getProperty("username");
        properties.getProperty("password");

        properties.load(new FileInputStream("src/db.properties"));
        driverClassName=properties.getProperty("driverClassName");
        url=properties.getProperty("url");
        username=properties.getProperty("username");
        password=properties.getProperty("password");
    }
    public static void loadDriver(){
        Class.forName("com.mysql.jdbc.Driver");
    }catch (ClassNotFoundException e){
        e.printStackTrace();
    }
}

public static Connection getConnection(){
    Connection conn = null;
    try {
        loadDriver();
        conn = DriverManager.getConnection("jdbc:mysql:///web_test3", "root", "abc");
    }catch (Exception e){
        e.printStackTrace();
    }
    return conn;
}

public static void release(Statement stmt,Connection conn){
}

public static void release(ResultSet rs,Statement stmt,Connection conn){

}
