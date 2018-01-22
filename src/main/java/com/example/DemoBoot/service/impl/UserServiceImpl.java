package com.example.DemoBoot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DemoBoot.model.User;
import com.example.DemoBoot.repository.UserRepository;
import com.example.DemoBoot.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findById(long id) {
		return userRepository.findOne(id);
	}

	@Override
	public User findByName(String name) {
		return userRepository.findByUsername(name);
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void deleteUserById(long id) {
		userRepository.delete(id);
	}

	@Override
	public List<User> findAllUsers() {		
		return (List<User>) userRepository.findAll();
	}

	@Override
	public void deleteAllUsers() {
		userRepository.deleteAll();
	}

	@Override
	public boolean isUserExist(User user) {		
		return findByName(user.getUsername()) != null;
	}

}
