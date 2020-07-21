package com.server;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validUser(String name, String password) {
		return name.equalsIgnoreCase(name) && password.equalsIgnoreCase(password);
	}
	
}
