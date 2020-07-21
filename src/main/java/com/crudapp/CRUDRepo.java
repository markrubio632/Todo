package com.crudapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository("todo")
public interface CRUDRepo extends CrudRepository<User, Integer>{

	//public User addUser(String name, String password);
	
}
