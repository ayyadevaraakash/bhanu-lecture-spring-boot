package com.tcs.TypesOfInjections.entity;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	private String name;
	private int age;
	private Student student;
	
	// Field Injection
//	private String name = "Bhanu";
//	private int age;
//	private String subject;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}