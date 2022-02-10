package com.jps.test.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jps.test.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	// if we want to serch by own choice then we have to use "findBy"+ followed by
	// choiced property.
	public List <User> findByName(String name);

}
