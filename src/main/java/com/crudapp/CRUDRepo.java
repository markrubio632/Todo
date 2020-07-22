package com.crudapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository("CRUDRepo")
public interface CRUDRepo extends CrudRepository<User, Integer>{

	//this line is giving me all the issues
	//void save(String name, String password);

	//public User addUser(String name, String password);
	
}
