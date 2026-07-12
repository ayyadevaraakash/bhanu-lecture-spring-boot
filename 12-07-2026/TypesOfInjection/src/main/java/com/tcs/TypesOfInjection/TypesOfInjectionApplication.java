package com.tcs.TypesOfInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.TypesOfInjection.entity.Address;
import com.tcs.TypesOfInjection.entity.Student;

@SpringBootApplication
public class TypesOfInjectionApplication implements CommandLineRunner {
	
	@Autowired
	private Student student;
	
	@Autowired
	private Address address;

	public static void main(String[] args) {
		SpringApplication.run(TypesOfInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		address.setRoomNumber(404);
		address.setAreaName("Kurla");
		
		student.setName("Akash");
		student.setRollNumber(17);
		student.setAddress(address);
		
		address.setStudent(student);
		
		System.out.println(student);
		
//		student.dance();
		
//		student.dance();
		
//		Address address = new Address(404, "Kurla");
//		Student student = new Student(17, "Akash", address);
		
//		address.setRoomNumber(404);
//		address.setAreaName("Kurla");
//		
//		student.setRollNumber(17);
//		student.setName("Akash");
//		student.setAddress(address);
//		
//		System.out.println(student);
	}
}
