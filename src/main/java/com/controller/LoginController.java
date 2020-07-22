package com.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dao.UserDaoImpl;
import com.model.User;
import com.server.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	LoginService loginservice;

	@Autowired
	UserDaoImpl userdaoimpl;

	@GetMapping("/login")
	public String showLoginPage(ModelMap model) {
		return "login";
	}

	@PostMapping("/login")
	public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {

		boolean isValidUser = loginservice.validUser(name, password);

		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}

		model.put("name", name);
		model.put("password", password);
		
		//this line adds the user into the DB
		userdaoimpl.addUser(new User(0,name, password));

		return "welcome";
	}

}
