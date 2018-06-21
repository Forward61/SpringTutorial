package com.itheima.po;

/**
 * Created by ningli on 2018/5/31.
 */
public class IdCard {
    private Integer id;
    private String code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "id _ name _ age : " + id + " _"+code +"_" +code;
    }
}
