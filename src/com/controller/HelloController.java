package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ningli on 2018/7/17.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(){

        System.out.println("-----------Test-----------值=" + "hello" + "," + "当前类=.()");
        return "index";
    }
}
