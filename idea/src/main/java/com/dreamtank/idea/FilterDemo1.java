package com.dreamtank.idea;

import jakarta.servlet.ServletResponse;

import java.util.logging.Filter;

public class FilterDemo1 implements Filter {
    public void init(FilterConfig filterConfig throws ServletException){

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException{
        System.out.println("FilterDemo1执行了...");
        chain.doFilter(request, response);
    }

    public void destroy(){

    }
}
