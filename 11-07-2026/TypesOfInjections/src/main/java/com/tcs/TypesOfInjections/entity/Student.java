package com.tcs.TypesOfInjections.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private Integer rollNo;
	private String name;
	private Teacher teacher;
	
	// Field Injection
//	private Integer rollNo;
//	private String name;
//	
//	@Autowired
//	private Teacher teacher;
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void getTeacherName() {
		System.out.println("My teacher name is " + this.teacher.getName());
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}