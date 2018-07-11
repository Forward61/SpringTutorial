package com.controller;

import com.po.User;
import com.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by ningli on 2018/7/5.
 */

@Controller
public class UserController {

    @RequestMapping(value = "/testJson", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public User testJson(@RequestBody User user)
    {

        System.out.println("-----------Test-----------值=" +user.getUsername()+ "ss" + "," + "当前类=.()");
        //handle jsonInfo object instance
        return user;
    }

    @RequestMapping(value="/user")
    public String handleRequest(HttpServletRequest httpServletRequest) throws Exception {
        System.out.println("-----------Test-----------值=" + "当前类=.()");
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("msg","测试信息");
////        modelAndView.setViewName("/index.jsp");
////        modelAndView.setViewName("/index");

        String id = httpServletRequest.getParameter("id");
        System.out.println("-----------Test-----------id值=" + id + "," + "当前类=.()");
        return "index";
    }

    @RequestMapping(value="/uint")
    public String handleRequest(Integer integer) throws Exception {
        System.out.println("-----------Test-----------值=" + "当前类=.()");
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("msg","测试信息");
////        modelAndView.setViewName("/index.jsp");
////        modelAndView.setViewName("/index");

        System.out.println("-----------Test-----------integer   =" + integer + "," + "当前类=.()");
        return "index";
    }

    @RequestMapping(value = "/toRegister")
    public String toReg(){
        return "register";
    }

    @RequestMapping("/registerUser")
    public String registerUser(User user){
        String username = user.getUsername();
        Integer password=user.getPassword();
        System.out.println("-----------Test-----------username值=" + username + "," + "当前类=.()");
        System.out.println("-----------Test-----------password值=" + password + "," + "当前类=.()");
        return "index";

    }

    @RequestMapping("/toUser")
    public String selectUser(){
        return "user";
    }

    @RequestMapping("deleteUsers")
    public String deleteUser(Integer[] ids){
        if (ids!=null){
            for (Integer id : ids) {
                System.out.println("-----------Test-----------id值=" + id + "," + "当前类=.()");
            }
        }
        return "index";
    }
    @RequestMapping("/toUserEdit")
    public String toUserEdit(){
        return "user_edit";
    }

    @RequestMapping("/editUsers")
    public String editUser(UserVo userVo){
        List<User> users = userVo.getUsers();
//        for (User user : users){
//            if (user.getId()!=null){
//                System.out.println("-----------Test-----------id值=" + user.getId()+ user.getUsername() + "," + "当前类=.()");
//            }
//
//        }

        return "index";
    }
//    @RequestMapping("/testJson")
//    @ResponseBody
//    public User testJson(@RequestBody User user){
//
//        System.out.println("-----------Test-----------user值=" + user + "," + "当前类=.()");
//        return user;
//    }


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
