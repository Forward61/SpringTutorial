package com.controller;

import com.po.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ningli on 2018/8/2.
 */
@Controller
public class CustomerControlller {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/findCustomerById")
    public String findCustomerById(Integer id, Model model){
        Customer customer = customerService.findCustomerById(id);
        model.addAttribute("customer",customer);
        return "customer";
    }

}
