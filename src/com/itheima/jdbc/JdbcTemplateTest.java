package com.itheima.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by ningli on 2018/3/20.
 */
public class JdbcTemplateTest {
//    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc_applicationContext.xml");
//        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
////        jdbcTemplate.execute("create TABLE account("+"id int PRIMARY KEY auto_increment,"+"username VARCHAR (50),"+
////                "balance DOUBLE )");
//        System.out.println("-----------Test-----------值=" + "账户表创建成功" + "," + "当前类=.()");
//    }
    @Test
    public void mainTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc_applicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        jdbcTemplate.execute("SELECT  * FROM account");
        System.out.println("-----------Test-----------值=" + "账户表查询成功" + "," + "当前类=.()");

    }

    @Test
    public void addAccountTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc_applicationContext.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        Account account = new Account();
        account.setUsername("tom");
        account.setBalance(1000.00);
//        int num = accountDao.addAccount(account);
//        System.out.println("-----------Test-----------num值=" + num + "," + "当前类=.()");
    }

    @Test
    public void findAccountByIdTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc_applicationContext.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        Account account = accountDao.findAccountById(1);
        System.out.println("-----------Test-----------account值=" + account + "," + "当前类=.()");
    }

    @Test
    public void findAllAccountTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc_applicationContext.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        List<Account> accounts = accountDao.findAllAcount();
        for (Account act:accounts){
            System.out.println("-----------Test-----------act值=" + act + "," + "当前类=.()");
        }
    }

    @Test
    public void xmlTranstionTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc_applicationContext.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");

        accountDao.transfer("tom","jack", 100.0);
        System.out.println("-----------Test-----------转账成功！值="  + "," + "当前类=.()");
    }

    @Test
    public void annotationTranstionTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annota_trans_applicationContext.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");

        accountDao.transfer("tom","jack", 100.0);
        System.out.println("-----------Test-----------转账成功！值="  + "," + "当前类=.()");
    }
}

