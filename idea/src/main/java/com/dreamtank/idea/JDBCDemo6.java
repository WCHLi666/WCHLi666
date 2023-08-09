package com.dreamtank.idea;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBCDemo6 {
    public void demo6(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = JDBCUtils.getConnection();
            String sql = "insert into user values (null,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"eee");
            pstmt.setString(2, "abc");
            pstmt.setString(3,"旺财");
            pstmt.setInt(4, 32);
            pstmt.executeUpdate();
            int num = pstmt.executeUpdate();
            if (num > 0){
                System.out.println("bccg");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JDBCUtils.release(pstmt, conn);
        }
    }
}
