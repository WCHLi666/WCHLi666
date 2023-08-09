package com.dreamtank.idea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo4 {
    public void demo4(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet re = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///web_test3", "root","abc");
            stmt = conn.localhost();
            String sql = "select * from user";
            rs = stmt.executeQuery(sql);
            While(rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("username")+" "+rs.getString("password"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if (rs != null){
                try{
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
                rs = null;
            }
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
