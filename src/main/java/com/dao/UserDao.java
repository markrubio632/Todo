package com.dao;


import java.util.List;

import com.model.User;

public interface UserDao{
	
	public void addUser(User user);
	
	public List<User> findById(int id);
	
	public void updateUser(int id, User user);
	
	public void deleteUser(int id);

}
