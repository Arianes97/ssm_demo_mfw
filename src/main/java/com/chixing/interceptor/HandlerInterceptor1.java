package com.chixing.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandlerInterceptor1 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest arg0,HttpServletResponse arg1,Object o) throws Exception {
        System.out.println("HandlerInterceptor1--->preHandle");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest arg0,HttpServletResponse arg1,Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("HandlerInterceptor1--->postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest arg0,HttpServletResponse arg1,Object o, Exception e) throws Exception {
        System.out.println("HandlerInterceptor1--->afterCompletion");
    }
}
