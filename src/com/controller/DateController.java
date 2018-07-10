package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by ningli on 2018/7/10.
 */
@Controller
public class DateController{

    @RequestMapping("/c")
    public String CustomDate(Date date){
        System.out.println("-----------Test-----------date值=" + date + "," + "当前类=.()");
        return "index";
    }
}
