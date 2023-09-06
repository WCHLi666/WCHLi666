package com.dreamtank.idea;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class CustomerServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String method = request.getParameter("method");
        if ("regist".equals(method)){
            regist(request, response);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request, response);
    }

    public void regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Customer c = new Customer();
        try {
            BeanUtils.populate(c, request.getParameterMap());
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }

        ICustomerService customerService = new ICustomerServiceImpl();
        customerService.addCustomer(c);
    }
}
