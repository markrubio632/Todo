package com.server;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Service
public class LoginService {

	public boolean validUser(String name, String password) {
		//order: pull name and password -> check if exists in DB -> return true or false ->
		//if true than login, if false error message
		return name.equalsIgnoreCase(name) && password.equalsIgnoreCase(password);
	}
	
	/*
	 * public List<User> getUsers(){ List<User> userList = new ArrayList<User>();
	 * userList.get(0); return userList; }
	 */
	
	
}
