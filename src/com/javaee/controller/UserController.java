package com.javaee.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaee.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("result")
	public String toResult(Model model){
		String age = userService.getIdByAge("23");
		System.out.println(age);
		model.addAttribute("message",age);
		return "result";
	}
}
