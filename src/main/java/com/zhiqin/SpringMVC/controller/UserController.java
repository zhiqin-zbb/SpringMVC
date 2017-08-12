package com.zhiqin.SpringMVC.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiqin.SpringMVC.model.User;
import com.zhiqin.SpringMVC.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("index")
    public String index() {
        return "index";
    }

//    @RequestMapping("login")
//    public String login(@RequestParam("username") String username,
//                        @RequestParam("password") String password,
//                        ModelMap modelMap) {
//        if (userService.loginVerify(username, password)) {
//            User user = userService.getUserByUsername(username);
//            modelMap.addAttribute("user", user);
//            return "/user/showInfo";
//        } else
//            return "fail";
//    }

    @RequestMapping("getUserInfoById")
    public @ResponseBody
    Map getUserInfoById(@RequestParam("id") int id) {
        Map<String, User> map = new HashMap<>();
        map.put("userInfo", userService.getUserById(id));
        return map;
    }

    @RequestMapping("getUserInfo")
    public @ResponseBody
    Map getUserInfo(@RequestParam("username") String username) {
        Map<String, User> map = new HashMap<>();
        map.put("userInfo", userService.getUserByUsername(username));
        return map;
    }

    @RequestMapping("verify")
    public @ResponseBody
    Map verify(@RequestParam("username") String username,
               @RequestParam("password") String password) {
        Map<String, String> map = new HashMap<>();
        map.put("result", userService.loginVerify(username, password));
        return map;
    }
}
