package com.itheima.jdk;

/**
 * Created by ningli on 2018/3/15.
 */
public class MyAspect {
    public void check_permissions(){
        System.out.println("-----------Test-----------值=" + "检查权限" + "," + "当前类=.()");

    }
    public void log(){
        System.out.println("-----------Test-----------值=" + "记录日志" + "," + "当前类=.()");

    }
}
