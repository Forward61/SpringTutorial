package com.itheima.xml;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.security.KeyPair;

/**
 * Created by ningli on 2018/3/15.
 */
public class MyAspect {
    public void myBefore(JoinPoint joinpoint){
        System.out.println("-----------Test-----------值=" + "前置通知，模拟执行权限检查" + "," + "当前类=.()");
        System.out.println("-----------Test-----------值=" + "目标类" + joinpoint.getTarget() + "," + "当前类=.()");
        System.out.println("-----------Test-----------值=" + "被植入增强处理的目标方法为" + joinpoint.getSignature().getName()+ "," + "当前类=.()");

    }
    public void myAfterReturning(JoinPoint joinPoint){
        System.out.println("-----------Test-----------值=" + "后置通知，模拟记录日志" + "," + "当前类=.()");
        System.out.println("-----------Test-----------值=" + "被植入增强处理的木百奥方法" + joinPoint.getSignature().getName() + "," + "当前类=.()");

    }
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("-----------Test-----------值=" + "环绕开始，执行目标方法之前，模拟开启事务" + "," + "当前类=.()");
        Object object = proceedingJoinPoint.proceed();
        System.out.println("-----------Test-----------值=" + "环绕结束，执行目标方法之后，模拟关闭事务" + "," + "当前类=.()");
        return object;
    }
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("-----------Test-----------值=" + "异常通知，出错了" + e.getMessage()+ "," + "当前类=.()");

    }
    public void myAfter(JoinPoint joinPoint){
        System.out.println("-----------Test-----------值=" + "最终通知：模拟方法结束之后的释放资源" + "," + "当前类=.()");

    }
}
