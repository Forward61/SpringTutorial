package com.itheima.cglib;

/**
 * Created by ningli on 2018/3/17.
 */
public class CglibTest {
    public static void main(String[] args) {

        CglibProxy cglibProxy = new CglibProxy();
        UserDao userDao = new UserDao();
        UserDao userDao1 = (UserDao) cglibProxy.createProxy(userDao);
        userDao1.addUser();
        userDao1.deleteUser();
    }
}
