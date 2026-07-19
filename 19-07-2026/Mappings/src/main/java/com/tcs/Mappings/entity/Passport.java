package com.tcs.Mappings.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_PASSPORT")
public class Passport {
	@Id
	private Integer passportNumber;
	private String issuingOffice;
	private String dateOfIssue;
	private String dateOfExpiry;
	
	public Integer getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(Integer passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getIssuingOffice() {
		return issuingOffice;
	}
	public void setIssuingOffice(String issuingOffice) {
		this.issuingOffice = issuingOffice;
	}
	public String getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
}