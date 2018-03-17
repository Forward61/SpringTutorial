package com.itheima.cglib;

import com.itheima.jdk.MyAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by ningli on 2018/3/17.
 */
//代理类
public class CglibProxy implements MethodInterceptor {
    //代理方法
    public Object createProxy(Object target){
        //创建一个动态类对象
        Enhancer enhancer = new Enhancer();
        //确定要增强的类，设置其父类
        enhancer.setSuperclass(target.getClass());
        //添加回调函数
        enhancer.setCallback(this);
        //返回创建的代理类
        return enhancer.create();
    }

    /**
     * * 所有动态代理类的方法调用，都会交友invoke方法去处理
     * proxy被代理后的对象
     * method 将要被执行的方法信息（反射）
     * args 执行方法时需要的参数
     * @param proxy
     * @param method
     * @param args
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //声明切面
        MyAspect myAspect = new MyAspect();
        //前增强
        myAspect.check_permissions();
        //在目标类上调用方法，并传入参数
        Object obj = methodProxy.invokeSuper(proxy,args);
        //后增强
        myAspect.log();
        return obj;
    }
}
