package com.tcs.mvc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tcs.mvc.dto.UserLoginDto;
import com.tcs.mvc.entity.UserEntity;
import com.tcs.mvc.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public String showRegisterPage() {
		return "register";
	}
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute UserEntity outside) {
		userService.saveUserToDatabase(outside);
		return "login";
	}
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	@PostMapping("/login")
	public String loginUser(@ModelAttribute UserLoginDto outside) {
		Optional<UserEntity> box = userService.getById(outside.getEmail());
		if (box.isEmpty()) {
			return "error";
		}
		UserEntity dbUser = box.get();
		if (dbUser.getPassword().equals(outside.getPassword())) {
			return "home";
		} else {
			return "error";
		}
	}
}