package com.tcs.oneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.oneToManyMapping.entity.Department;
import com.tcs.oneToManyMapping.entity.Student;
import com.tcs.oneToManyMapping.repository.DepartmentRepository;
import com.tcs.oneToManyMapping.repository.StudentRepository;

@SpringBootApplication
public class OneToManyMappingApplication implements CommandLineRunner {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Department computerDepartment = new Department();
		computerDepartment.setDeptId(1);
		computerDepartment.setDeptName("Computer");
		computerDepartment.setHod("Akash");
		
		Department civilDepartment = new Department();
		civilDepartment.setDeptId(2);
		civilDepartment.setDeptName("Civil");
		civilDepartment.setHod("Dhanya");
		
		departmentRepository.saveAll(List.of(computerDepartment, civilDepartment));
		
		Student student = new Student();
		student.setId(1);
		student.setName("Bhanu");
		student.setAge(25);
		student.setDepartment(computerDepartment);
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Bhavitha");
		student2.setAge(24);
		student2.setDepartment(computerDepartment);
		
		Student student3 = new Student();
		student3.setId(3);
		student3.setName("Vasanth");
		student3.setAge(25);
		student3.setDepartment(civilDepartment);
		
		studentRepository.saveAll(List.of(student,student2,student3));
		
		computerDepartment.setStudents(List.of(student, student2));
		civilDepartment.setStudents(List.of(student3));
		
		for (Student s : computerDepartment.getStudents()) {
			System.out.println(s);
		}
	}
}