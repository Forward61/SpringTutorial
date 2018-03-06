package com.itheima.ioc;

/**
 * Created by ningli on 2018/3/6.
 */
public class UserServiceImpl implements UserService {
    //添加UserDao属性
    private UserDao userDao;
    //添加UserDao属性的setter方法，用于实现依赖注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //实现的接口方法
    @Override
    public void say() {
        //调用UserDao的say方法，并执行输出语句
        this.userDao.say();
        System.out.println("-----------Test-----------UserService值="  + "," + "当前类=.()");
    }
}
