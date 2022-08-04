package com.javasm.demo.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter("*.do")
public class HelloFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("hello A");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("hello A2");
    }

    @Override
    public void destroy() {

    }
}
