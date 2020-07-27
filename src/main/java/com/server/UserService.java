package com.server;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class UserService {
	//this code is to check the user's name and pass
	/*
	 * public Boolean registrationSuccessful(String name, String password) {
	 * 
	 * if(name.isEmpty() == false && password.isEmpty() == false) { return true; }
	 * else { return false; }
	 * 
	 * }
	 */
	
	//this just tests if the user is successfully created
	//if true, then add password functionality
public Boolean registrationSuccessful(String name) {
		
		if(name.isEmpty() == false) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
