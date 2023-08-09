package com.dreamtank.idea;

public class JDBCDemo8 {
    public void demo8(){
        Connection conn = null;
        Statement stmt = null;
        try{
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql1 = "create database test1";
            String sql2 = "use test1";
            String sql3 = "create table user(id int primary key auto_increment,name varcha(20))";
            String sql4 = "insert into user values (null,'aaa')";
            String sql5 = "insert into user values (null,'bbb')";
            String sql6 = "insert into user values (null,'ccc')";
            String sql7 = "update user set name = 'mmm' where id = 2";
            String sql8 = "delete from user where id = 1";
            stmt.addBatch(sql1);
            stmt.addBatch(sql2);
            stmt.addBatch(sql3);
            stmt.addBatch(sql4);
            stmt.addBatch(sql5);
            stmt.addBatch(sql6);
            stmt.addBatch(sql7);
            stmt.addBatch(sql8);
            stmt.executeBatch();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            JDBCUtils.release(stmt, conn);
        }
    }
}
