package com.server;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class UserService {
	
	public Boolean registrationSuccessful(String name, String password) {
		
		if(name.isEmpty() == false && password.isEmpty() == false) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
