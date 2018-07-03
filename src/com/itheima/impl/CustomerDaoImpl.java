package com.itheima.impl;

import com.itheima.dao.CustomerDao;
import com.itheima.po.Customer;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by ningli on 2018/7/3.
 */
public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {
    @Override
    public Customer findCustomerById(Integer id) {
        return this.getSqlSession().selectOne("com.itheima.mapper"+".CustomerMapper.findCustomerById",id);
    };

}
