package com.dreamtank.idea;

import java.sql.PreparedStatement;

public class TransactionDemo1 {
    public void demo1(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = JDBCUtils.getConnection();
            String sql = "update account set money = money + ? where name = ";
            pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, -1000);
            pstmt.setString(2, "aaa");
            pstmt.executeUpdate();
            pstmt.setDouble(1, 1000);
            pstmt.setString(2,"bbb");
            pstmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JDBCUtils.release(pstmt, conn);
        }
    }
}
