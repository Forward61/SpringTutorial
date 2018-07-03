package com.itheima.dao;

import com.itheima.po.Customer;

/**
 * Created by ningli on 2018/7/3.
 */
public interface CustomerDao {
    public Customer findCustomerById(Integer id);
}
