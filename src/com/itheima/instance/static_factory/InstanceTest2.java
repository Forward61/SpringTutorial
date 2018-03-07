package com.itheima.instance.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ningli on 2018/3/7.
 */
public class InstanceTest2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("-----------Test-----------`值=" + applicationContext.getBean("bean2") + "," + "当前类=.()");
    }
}
