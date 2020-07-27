package com.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.crudapp.CRUDRepo;
import com.dao.UserDaoImpl;
import com.model.User;
import com.server.UserService;

@Controller
@SessionAttributes("name")
public class UserController {

	@Autowired
	UserDaoImpl userdaoimpl;
	
	@Autowired
	UserService userservice;

	@Autowired
	CRUDRepo repo;
	
	//this creates a user model and places it to the model
	@GetMapping("/register")
	public String registerUser(ModelMap model) {
		User user = new User();
		model.addAttribute(user);
		return "register";
	}
	
	//manipulates the current user in the model (from the get) and puts new info in that model
	@PostMapping("/register")
	public String registerRedirect(ModelMap model, User user) {
		
		
		
		model.put("user", user);
		userdaoimpl.addUser(user);
		/*
		 * if (userservice.registrationSuccessful(user)){
		 * 
		 * }
		 */
		//should be something to check if user regis was succ with a timed redirect to other page
		
		return "redirect:/registrationStatus";
	}
	
	@GetMapping("registrationStatus")
	public String regisStatus(ModelMap model, User user, String id) {
		// pull list of users, find by name, pull name, insert onto model
		
		//this should pull all users in the list
		List<User> listOfUsers = userdaoimpl.findList();
		//places users into list
		model.put("listOfUsers", listOfUsers);
		System.out.println(listOfUsers);
		//pulls attribute(s) //this current statement doesnt work
		model.getAttribute(id);
		//this evaluates to null in console
		System.out.println(model.get(id));
		
		return "registrationStatus";
	}

	@GetMapping("/user")
	public String findUsers(ModelMap model) {
		
		List<User> listOfUsers = userdaoimpl.findList();
		model.put("listOfUsers", listOfUsers);
		
		return "user";
	}
	
	//create a delete page?
	@DeleteMapping("/deleteUser")
	public void deleteUserById(int id) {
		userdaoimpl.deleteUser(id);
	}
	
	//create an update page?
	@PutMapping("//updateUser")
	public void updateUser(int id, User user) {
		//function to delete by userid
		userdaoimpl.deleteUser(id);
		//function to save as a new record
		userdaoimpl.addUser(user);
	}
}
