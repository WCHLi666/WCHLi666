package com.dreamtank.idea;

public class JDBCDemo5 {
    public void demo5(){
        UserDao userDao = new UserDao();
        boolean flag = userDao.login("aaa", "123");
        if (flag){
            System.out.println("dlcg");
        }else{
            System.out.println("dlsb");
        }
    }
}
