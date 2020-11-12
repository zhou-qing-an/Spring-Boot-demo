package com.qingan.filter;

import javax.servlet.*;
import java.io.IOException;

public class FilterOne implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("---------Filter  init 执行-------------");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("---------Filter  doFilter 执行-------------");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("---------Filter  destroy 执行-------------");
    }
}
