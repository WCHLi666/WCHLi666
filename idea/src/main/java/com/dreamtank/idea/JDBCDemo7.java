package com.dreamtank.idea;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBCDemo7 {
    public void demo7(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = JDBCUtils.getConnection();
            String sql = "update user set username = ?,password =?,nickname=?,age = ? where id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "abc");
            pstmt.setString(2, "1234");
            pstmt.setString(3, "旺旺");
            pstmt.setInt(4, 23);
            pstmt.setInt(5, 6);
            int num = pstmt.executeUpdate();
            if (num > 0){
                System.out.println("xgcg");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JDBCUtils.release(pstmt, conn);
        }
    }
}
