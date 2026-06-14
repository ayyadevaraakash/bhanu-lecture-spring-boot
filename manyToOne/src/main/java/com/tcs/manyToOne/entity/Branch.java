package com.tcs.manyToOne.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Branch {
	@Id
	String name;
	
	String hod;
	
	@OneToMany(mappedBy = "branch", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	List<Student> students;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHod() {
		return hod;
	}

	public void setHod(String hod) {
		this.hod = hod;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Branch(String name, String hod, List<Student> students) {
		super();
		this.name = name;
		this.hod = hod;
		this.students = students;
	}

	public Branch() {
		super();
	}

	@Override
	public String toString() {
		return "Branch [name=" + name + ", hod=" + hod + ", students=" + students + "]";
	}	
}