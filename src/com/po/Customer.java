package com.po;

/**
 * 客户持久类
 * Created by ningli on 2018/4/7.
 */
public class Customer {
    private Integer id;
    private String username;
    private String job;
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJobs() {
        return job;
    }

    public void setJobs(String job) {
        this.job = job;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer [id= " + id +",username= "+username+",jobs= "+job+"]";
    }
}
