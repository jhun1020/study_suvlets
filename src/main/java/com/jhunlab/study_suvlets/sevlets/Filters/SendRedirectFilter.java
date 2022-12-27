package com.jhunlab.study_suvlets.sevlets.Filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/simple/*")
public class SendRedirectFilter implements Filter{
    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {       
                System.out.println(request.getRemoteHost());
                System.out.println(request.getRemoteAddr());
                HttpServletRequest httpServletRequest = (HttpServletRequest)request;
                HttpServletResponse HttpServletResponse = (HttpServletResponse) response;

                String uri = httpServletRequest.getRequestURI();
            
                // 링크 끝이 servlets로 끝나면 서버에 다시 요청해서 인덱스로 보냄
                if(uri.endsWith("Servlets")){
                    HttpServletResponse.sendRedirect("/index.html");
                } else {
                    chain.doFilter(request, response);
                }
                
            }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
}
