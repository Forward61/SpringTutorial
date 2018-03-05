package com.itheima.ioc;

/**
 * Created by ningli on 2018/3/5.
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void say() {
        System.out.println("-----------Test-----------User值=" + "UserDao" + "," + "当前类=.()");
    }
}
