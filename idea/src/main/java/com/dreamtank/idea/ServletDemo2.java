package com.dreamtank.idea;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;

public class ServletDemo2 implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException{
        System.out.println("ServletDemo2初始化了");
    }

    @Override
    public ServletConfig getServletConfig(){
        return null;
    }
}
