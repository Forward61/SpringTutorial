package com.itheima.MybatisTest;

import com.itheima.po.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

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
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

        }
    }
}
