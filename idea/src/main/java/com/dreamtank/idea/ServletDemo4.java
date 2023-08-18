package com.dreamtank.idea;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.util.Enumeration;

public class ServletDemo4 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        ServletConfig config = this.getServletConfig();
        String username = config.getInitparameter("username");
        String password = config.getInitParameter("password");
        System.out.println(username+" "+password);
        Enumeration<String> names = config.getInitParameterNames();
        while(names.hasMore)
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request, response);
    }
}
