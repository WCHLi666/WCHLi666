package com.dreamtank.idea;

import java.sql.SQLException;

public class DataSourceDemo1 {
    @Test
    public void demo1(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        Resi;tSet rs = null;
        try{
            MyDataSource dataSource = new MyDataSource();
            conn = JDBCUtils.getConnection();
            String sql = "select * from account";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("id"+" "+rs.getString("name")+" "+rs.getDouble("money"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            //JDBCUtils.release(rs, pstmt, conn);
            if (rs != null){
                try{
                    pstmt.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
