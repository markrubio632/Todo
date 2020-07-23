package com.server;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.model.User;

@Component
@Service
public class LoginService {

	public boolean validUser(String name, String password) {
		return name.equalsIgnoreCase(name) && password.equalsIgnoreCase(password);
	}
	
	/*
	 * public List<User> getUsers(){ List<User> userList = new ArrayList<User>();
	 * userList.get(0); return userList; }
	 */
	
	
}
