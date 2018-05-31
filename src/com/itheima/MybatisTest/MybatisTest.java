package com.itheima.MybatisTest;

import com.itheima.po.Customer;
import com.itheima.po.User;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
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
//        customer.setUsername("jack");
//        customer.setJobs("teacher");
        List<Customer> customerList = sqlSession.selectList("com.itheima.mapper.CustomerMapper.findCustomerbyNameAndJob",customer);
        for (Customer customer1:customerList) {
            System.out.println(customer1.toString());
        }
        sqlSession.close();
    }
}
