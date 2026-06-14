package com.tcs.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.main.entity.Adhar;
import com.tcs.main.entity.User;
import com.tcs.main.repository.UserRepository;

@SpringBootApplication
public class HibernateMappingsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HibernateMappingsApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		Adhar adhar = new Adhar();
		adhar.setAdharNo("9172");
		adhar.setAddress("Samalkot");
		
		User user = new User();
		user.setId(2);
		user.setName("Bhanu");
		user.setAge(27);
		user.setAdhar(adhar);
		
		userRepository.save(user);
	}

}
