package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crudapp.CRUDRepo;
import com.model.User;

@Component
public class UserDaoImpl implements UserDao{
	
	@Autowired
	CRUDRepo crudrepo;
	
	public void addUser(User user) {
		crudrepo.save(user);
	}
	
	public List<User> findById(int id) {
		Optional<User> user1 = crudrepo.findById(id);
		return user1.isPresent() ? (List)user1.get() : null;
	}
	
	public void deleteUser(int id) {
		crudrepo.deleteById(id);
	}

	@Override
	public void updateUser(int id, User user) {
		// TODO Auto-generated method stub
		
	}

}
