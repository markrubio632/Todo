package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.crudapp.CRUDRepo;
import com.dao.UserDaoImpl;
import com.model.User;
import com.server.LoginService;

@Controller
@SessionAttributes("name")
public class UserController {

	@Autowired
	UserDaoImpl userdaoimpl;

	@Autowired
	CRUDRepo repo;

	@GetMapping("/user")
	public String user(ModelMap model) {
		repo.findAll();
		System.out.println(userdaoimpl.findList());
		return "user";
	}

	// this gets a reponse printed in the web page, but doesnt use JSP page
	/*
	 * @GetMapping("/user") public @ResponseBody Iterable<User> getAllUsers() {
	 * return repo.findAll(); }
	 */

	/*
	 * @PostMapping("/user") public String showUsers(ModelMap model, @RequestParam
	 * String id, @RequestParam String name,
	 * 
	 * @RequestParam String password) {
	 * 
	 * model.put("id", id); model.put("name", name);
	 * System.out.println(model.put("password", password)); return "user"; }
	 */

	// this will be added once the user show page is done
	/*
	 * @GetMapping("/register") public String getRegister() { return "register"; }
	 * 
	 * @PostMapping("/register") public String leaveRegister() { return
	 * "redirect:/user"; }
	 */

}
