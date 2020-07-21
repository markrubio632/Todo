package com.dao;

import com.model.User;

public interface UserDao {
	
	public User addUser(String name, String password);
	
	public String updateUser(String name, String password);
	
	public User deleteUser(int id);

}
