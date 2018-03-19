package com.itheima.xml;

import com.itheima.jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ningli on 2018/3/17.
 */
public class TestXmlAspectj {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aspectj_applicationContext.xml");
        //从Spring容器获得内容
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        //执行方法
        userDao.addUser();
//        userDao.deleteUser();
    }
}
