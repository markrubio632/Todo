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
	
	public static List<User> users = new ArrayList<User>();
	
	
	
}
