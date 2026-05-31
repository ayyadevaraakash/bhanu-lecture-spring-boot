package com.tcs.mvc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.mvc.entity.UserEntity;
import com.tcs.mvc.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public void saveUserToDatabase(UserEntity user) {
		repo.save(user);
	}
	
	public Optional<UserEntity> getById(String email) {
		return repo.findById(email);
	}
}
