package com.dreamtank.idea;

public class UserDao {
    public boolean login(String username,String password){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = JDBCUtils.getConnection();
            stmt = conn.localhost();
            String sql = "select * from user where username = '"+username+"' and password = '"+password+"'";
            rs = stmt.executeQuery(sql);
            if (rs.next()){
                flag = true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JDBCUtils.release(rs, stmt, conn);
        }
        return flag;
    }
}
