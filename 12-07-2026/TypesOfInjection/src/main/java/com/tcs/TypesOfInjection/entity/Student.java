package com.tcs.TypesOfInjection.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private Integer rollNumber;
	private String name;
	private Address address;
	
	public void dance() {
		System.out.println("Dancing at " + address);
	}
	
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + "]";
	}
}
