package com.test.lxl.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @description:
 * @author: Lixinling
 * @create: 2020-02-27 10:51
 **/
@WebFilter(urlPatterns ="/*")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入Filter进行处理。。。");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
