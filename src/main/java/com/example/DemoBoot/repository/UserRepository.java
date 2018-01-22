package com.example.DemoBoot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.DemoBoot.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	User findByUsername(String name);

}
