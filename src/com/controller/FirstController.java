package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ningli on 2018/7/5.
 */

@Controller
@RequestMapping(value = "/hello")
public class FirstController{

    @RequestMapping(value="/ff")
    public String handleRequest(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse, Model model) throws Exception {
        System.out.println("-----------Test-----------值=" + "当前类=.()");
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("msg","测试信息");
////        modelAndView.setViewName("/index.jsp");
////        modelAndView.setViewName("/index");

        model.addAttribute("msg","ssdslkl");
        System.out.println("-----------Test-----------值="  + "当前类=.()");
        return "index";
    }
}

//public class FirstController implements Controller{
//
//    @Override
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse) throws Exception {
//        System.out.println("-----------Test-----------值=" + "当前类=.()");
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("msg","测试信息");
//        modelAndView.setViewName("/index.jsp");
//        return modelAndView;
//    }
//}
