package com.itheima.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by ningli on 2018/3/15.
 */
//切面类
public class MyAspect implements MethodInterceptor{
    public void check_permissions(){
        System.out.println("-----------Test-----------值=" + "检查权限" + "," + "当前类=.()");

    }
    public void log(){
        System.out.println("-----------Test-----------值=" + "记录日志" + "," + "当前类=.()");

    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        check_permissions();
        //执行目标方法
        Object object = methodInvocation.proceed();
        log();
        return  object;
    }
}
