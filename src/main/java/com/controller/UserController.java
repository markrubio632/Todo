package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dao.UserDaoImpl;
import com.model.User;
import com.server.LoginService;

@Controller
@SessionAttributes("name")
public class UserController {

	@Autowired
	LoginService login;
	
	@Autowired
	UserDaoImpl userdaoimpl;
	
	@GetMapping("/user")
	public String user() {
		List<User>uList = LoginService.users;
		System.out.println(uList);
		userdaoimpl.findByAll();
		return "user";
	}

	@PostMapping("/user")
	public String showUsers() {
		
		
		return "user";
	}
	
	//this will be added once the user show page is done
	/*
	 * @GetMapping("/register") public String getRegister() { return "register"; }
	 * 
	 * @PostMapping("/register") public String leaveRegister() { return
	 * "redirect:/user"; }
	 */

}
