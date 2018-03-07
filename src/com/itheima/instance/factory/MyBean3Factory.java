package com.itheima.instance.factory;

/**
 * Created by ningli on 2018/3/7.
 */
public class MyBean3Factory {
    public MyBean3Factory(){
        System.out.println("-----------Test-----------值=" + "工厂实例化" + "," + "当前类=.()");
    }
    public MyBean3 createBean (){
        return  new MyBean3();
    }
}
