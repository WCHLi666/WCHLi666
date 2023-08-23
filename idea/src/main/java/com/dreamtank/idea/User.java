package com.dreamtank.idea;

public class User {
    public User(){

    }

    public User(String username){
        this.username = username;
    }
    private String username;
    public String sayHello(String msg){
        return "hello" + msg;
    }
}
