package com.zhiqin.SpringMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiqin.SpringMVC.model.User;
import com.zhiqin.SpringMVC.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("/user/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable int userId) {
		System.out.println(userId);
		User user = userService.getUserById(userId);
		modelMap.addAttribute("user", user);
		return "/user/showInfo";
	}

	@RequestMapping("index")
	public String index() {
		return "index";
	}
	// public String index(@RequestParam("username") String username,
	// @RequestParam("password") String password) {
	// System.out.println("username: " + username);
	// System.out.println("password: " + password);
	// if (userService.loginVerify(username, password))
	// return "success";
	// else
	// return "fail";
	// }
}
