package com.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ningli on 2018/7/17.
 */
public class CustomerInterceptor222 implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("-----------Test-----------值=" + "  CustomerInterceptor222 ..  PreHandle" + "," + "当前类=.()");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("-----------Test-----------值=" + "  CustomerInterceptor222 ..  PostHandle" + "," + "当前类=.()");

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("-----------Test-----------值=" + "  CustomerInterceptor222 ..  afterCompletion" + "," + "当前类=.()");

    }
}
