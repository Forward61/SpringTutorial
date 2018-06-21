package com.itheima.MybatisTest;

import com.itheima.po.Customer;
import com.itheima.po.Person;
import com.itheima.po.User;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ningli on 2018/5/2.
 */
public class MybatisTest {

    @Test
    public void findCustomerByIDTest() {
        String resource= "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            Customer customer = sqlSession.selectOne("com.itheima.mapper" + ".CustomerMapper.findCustomerbyid",1);
            System.out.println(customer.toString());

            List<Customer> customers = sqlSession.selectList("com.itheima.mapper" +".CustomerMapper.findCustomerbyName","j");
            for (Customer customer1:customers) {
                System.out.println("-----------Test-----------customer1值=" + customer1 + "," + "当前类=.()");
            }

            Customer customer2 =new Customer();
            customer2.setUsername("rose");
            customer2.setJobs("student");
            customer2.setPhone("13333533091");
//            int rows = sqlSession.insert("com.itheima.mapper" +".CustomerMapper.addCustomer",customer2);
//            if (rows > 0) {
//                System.out.println("-----------Test-----------值=" +  "插入成功"+ "," + "当前类=.()");
//            }else {
//                System.out.println("-----------Test-----------值=" + "插入失败" + "," + "当前类=.()");
//            }
//            sqlSession.commit();

//            Customer customer3 = new Customer();
//            customer3.setId(4);
//            customer3.setUsername("rose");
//            customer3.setJobs("programmer");
//            customer3.setPhone("18579402223");
//            int rows = sqlSession.update("com.itheima.mapper" +".CustomerMapper.updateCustomer",customer3);
//            if (rows > 0) {
//                System.out.println("-----------Test-----------值=" +  "修改成功"+ "," + "当前类=.()");
//            }else {
//                System.out.println("-----------Test-----------值=" + "修改失败" + "," + "当前类=.()");
//            }

            int rows = sqlSession.update("com.itheima.mapper" +".CustomerMapper.deleteCustomer",4);
            if (rows > 0) {
                System.out.println("-----------Test-----------值=" +  "删除成功"+ "," + "当前类=.()");
            }else {
                System.out.println("-----------Test-----------值=" + "删除失败" + "," + "当前类=.()");
            }

            sqlSession.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

        }
    }

    @Test
    public void findAllUSerTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        List<User> userList = sqlSession.selectList("com.itheima.mapper.UserMapper.findAllUser");
        for (User user : userList){
            System.out.println(user.toString());
        }
        sqlSession.close();

    }

    @Test
    public void findCustomerByNameAndJobTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Customer customer = new Customer();
        customer.setUsername("jack");
        customer.setJobs("teacher");
        List<Customer> customerList = sqlSession.selectList("com.itheima.mapper.CustomerMapper.findCustomerbyNameAndJobTrim",customer);
        for (Customer customer1:customerList) {
            System.out.println(customer1.toString());
        }
        sqlSession.close();
    }
    @Test
    public void findCustomerByNameOrJobTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Customer customer = new Customer();
//        customer.setUsername("jack");
        customer.setJobs("teacher");
        List<Customer> customerList = sqlSession.selectList("com.itheima.mapper.CustomerMapper.findCustomerbyNameOrJob",customer);
        for (Customer customer1:customerList) {
            System.out.println(customer1.toString());
        }
        sqlSession.close();
    }

    @Test
    public void updateCustomerTestSet(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Customer customer = new Customer();
        customer.setId(3);
        customer.setPhone("138000002222");
        int row = sqlSession.update("com.itheima.mapper.CustomerMapper.updateCustomerSet",customer);
        if (row>0){
            System.out.println("修改了 "+ row +"条数据");
        }else {
            System.out.println("执行修改失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void findCustomerByIdsTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        List<Integer> ids= new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        List<Customer> customerList = sqlSession.selectList("com.itheima.mapper.CustomerMapper.findCustomerByIds", ids);
        for (Customer customer : customerList){
            System.out.println(customer);
        }

        sqlSession.close();
    }
    @Test
    public void findCustomerByNameTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        Customer customer = new Customer();
        customer.setUsername("j");
        List<Customer> customerList = sqlSession.selectList("com.itheima.mapper.CustomerMapper.findCustomerbyNameTest", customer);
        for (Customer customer2 : customerList){
            System.out.println(customer2);
        }

        sqlSession.close();
    }

    /**
     * 嵌套查询
     */
    @Test
    public void findPersonByIdTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Person person = sqlSession.selectOne("com.itheima.mapper.PersonMapper.findPersonById",1);
        System.out.println("-----------Test-----------person值=" + person + "," + "当前类=.()");


        Person person2 = sqlSession.selectOne("com.itheima.mapper.PersonMapper.findPersonById2",1);
        System.out.println("-----------Test-----------person值=" + person2 + "," + "当前类=.()");


        sqlSession.close();
    }

}
