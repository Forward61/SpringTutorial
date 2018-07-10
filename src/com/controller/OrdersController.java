package com.controller;

import com.po.Orders;
import com.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ningli on 2018/7/10.
 */
@Controller
public class OrdersController {

    @RequestMapping("/tofindOrdersWithUser")
    public String tofindOrdersWithUser(){
        return "order";
    }

    @RequestMapping("/findOrdersWithUser")
    public String findOrdersWithUser(Orders orders){
        Integer orderId= orders.getOrdersId();
        User user = orders.getUser();
        System.out.println("-----------Test-----------user.getUsername值=" + user.getUsername() + "," + "当前类=.()");
        return "success";
    }
}
