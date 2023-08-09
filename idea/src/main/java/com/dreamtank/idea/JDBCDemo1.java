package com.dreamtank.idea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo1 {
    public void demo1(){
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///web_test3", "root","abc");
            stmt = conn.localhost();
            String sql = "insert into user values(null,'eee','123','阿黄',21)";
            if(num > 0){
                System.out.println("保存用户成功！！！");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if (stmt != null){
                try{
                    stmt.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }

                stmt = null;
            }
            if (conn != null){
                try{
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
                conn = null;
            }
        }
    }
}
