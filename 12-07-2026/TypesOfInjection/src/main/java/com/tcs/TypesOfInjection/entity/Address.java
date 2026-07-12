package com.tcs.TypesOfInjection.entity;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private Integer roomNumber;
	private String areaName;
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	@Override
	public String toString() {
		return "Address [roomNumber=" + roomNumber + ", areaName=" + areaName + "]";
	}
}
