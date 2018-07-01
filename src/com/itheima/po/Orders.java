package com.itheima.po;

import java.util.List;

/**
 * Created by ningli on 2018/7/1.
 */
public class Orders {
    private Integer id;


    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String number;


    @Override
    public String toString() {
        return "id    " + id +" ,  number "+ number;
    }
}
