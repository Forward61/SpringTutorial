package com.itheima.po;

/**
 * Created by ningli on 2018/5/31.
 */
public class Person {
    private Integer id;
    private String name;
    private String  sex;
    private Integer age;
    private IdCard card;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public IdCard getCard() {
        return card;
    }

    public void setCard(IdCard idCard) {
        this.card = idCard;
    }

    @Override
    public String toString() {
        return "id _ name _ age : " + id + " _"+name +"_" +name;
    }
}
