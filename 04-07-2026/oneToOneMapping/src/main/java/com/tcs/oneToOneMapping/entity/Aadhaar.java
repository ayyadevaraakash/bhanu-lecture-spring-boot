package com.tcs.oneToOneMapping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Aadhaar {
	@Id
	Integer aadhaarNo;
	
	String aadhaarCenterLocation;

	public Integer getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(Integer aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	public String getAadhaarCenterLocation() {
		return aadhaarCenterLocation;
	}

	public void setAadhaarCenterLocation(String aadhaarCenterLocation) {
		this.aadhaarCenterLocation = aadhaarCenterLocation;
	}
}
