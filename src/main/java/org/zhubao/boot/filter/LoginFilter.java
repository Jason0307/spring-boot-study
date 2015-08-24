package org.zhubao.boot.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zhubao.boot.vo.UserVo;

public class LoginFilter implements Filter{

    private Logger logger = LoggerFactory.getLogger(LoginFilter.class);
    private String[] excludeUris = new String[]{"login, logout, main"};
    @Override
    public void destroy() {
        logger.info("start to destroy the login filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException,
            ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String uri = request.getRequestURI();
        for(String excludeUri : excludeUris) {
            if (!uri.contains(excludeUri)) {
                HttpSession session = request.getSession();
                UserVo userVo = (UserVo) session.getAttribute("user");
                if(null  == userVo) {
                    response.sendRedirect(request.getContextPath() + "/user/login");
                    break;
                } else {
                    filterChain.doFilter(servletRequest, servletResponse);
                }
            } else {
                filterChain.doFilter(servletRequest, servletResponse);
            }
        }
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        logger.info("start to init the login filter");
    }

}
