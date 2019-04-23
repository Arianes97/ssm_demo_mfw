package com.chixing.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckLoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest arg0,HttpServletResponse arg1,Object o) throws Exception {
        System.out.println("CheckLoginInterceptor--->preHandle");
        System.out.println("请先登录");
        arg0.getRequestDispatcher("/customer/tologin").forward(arg0,arg1);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest arg0,HttpServletResponse arg1,Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("CheckLoginInterceptor--->postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest arg0,HttpServletResponse arg1,Object o, Exception e) throws Exception {
        System.out.println("CheckLoginInterceptor--->afterCompletion");
    }
}
