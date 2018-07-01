package com.itheima.po;

import java.util.List;

/**
 * Created by ningli on 2018/5/31.
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;

    private  String username;
    private String address;
    private List<Orders> ordersList;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "id _ name _ age : " + id + " _"+name +"_" +age +" ,username  , address , orderlist "
                + username+", "+username+"  "  +address + ordersList;
    }
}
