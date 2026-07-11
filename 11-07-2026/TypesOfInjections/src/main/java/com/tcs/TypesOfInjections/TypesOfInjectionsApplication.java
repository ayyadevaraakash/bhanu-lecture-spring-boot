package com.tcs.TypesOfInjections;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.TypesOfInjections.entity.Student;
import com.tcs.TypesOfInjections.entity.Teacher;

@SpringBootApplication
public class TypesOfInjectionsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TypesOfInjectionsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Teacher t = new Teacher();
		t.setName("Akash");
		t.setAge(26);
		Student s = new Student();
		s.setName("Bhanu");
		s.setRollNo(17);
		s.setTeacher(t);
		t.setStudent(s);
	}

}
