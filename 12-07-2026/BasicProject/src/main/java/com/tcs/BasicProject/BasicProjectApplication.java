package com.tcs.BasicProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.BasicProject.entity.Address;
import com.tcs.BasicProject.entity.Student;

@SpringBootApplication
public class BasicProjectApplication implements CommandLineRunner {
	
	@Autowired
	private Student student;
	
	@Autowired
	private Student student2;
	
	@Autowired
	private Address address;

	public static void main(String[] args) {
		SpringApplication.run(BasicProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		address.setRoomNumber(404);
		address.setAreaName("Kurla");
		
		student.setName("Akash");
		student.setRollNo(12);
		student.setAddress(address);
		
		if (student==student2) {
			System.out.println("Both are same");
		}
		
		System.out.println(student);
	}
}