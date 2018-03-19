package com.itheima.jdk;

/**
 * Created by ningli on 2018/3/15.
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {

        //测试出错时的异常通知执行
        //int i = 10/0;
        System.out.println("-----------Test-----------值=" + "添加用户" + "," + "当前类=.()");
    }

    @Override
    public void deleteUser() {
        System.out.println("-----------Test-----------值=" + "删除用户" + "," + "当前类=.()");
    }
}
