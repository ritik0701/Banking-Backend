package com.lti.demo.dto;

import com.lti.demo.pojo.Account;

import java.math.BigDecimal;
import java.util.Date;

public class OpenAccountDTO {

	private String accountStatus;
	private String address;
	private String adminRemark;
	private BigDecimal annualIncome;
	private BigDecimal balance;
	private String city;
	private Date dob;
	private String email;
	private String father;
	private String firstname;
	private String landmark;
	private String lastname;
	private String middlename;
	private String occupation;
	private String phone;
	private int pincode;
	private String proofId;
	private String proofType;
	private String state;

	
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdminRemark() {
		return this.adminRemark;
	}

	public void setAdminRemark(String adminRemark) {
		this.adminRemark = adminRemark;
	}

	public BigDecimal getAnnualIncome() {
		return this.annualIncome;
	}

	public void setAnnualIncome(BigDecimal annualIncome) {
		this.annualIncome = annualIncome;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFather() {
		return this.father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLandmark() {
		return this.landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPincode() {
		return this.pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getProofId() {
		return this.proofId;
	}

	public void setProofId(String proofId) {
		this.proofId = proofId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProofType() {
		return proofType;
	}

	public void setProofType(String proofType) {
		this.proofType = proofType;
	}

	public Account getAccountFromDTO(OpenAccountDTO dto) {
		Account acc = new Account();
		acc.setAccountStatus(dto.accountStatus);
		acc.setAddress(dto.address);
		acc.setAdminRemark(dto.adminRemark);
		acc.setAnnualIncome(dto.annualIncome);
		acc.setBalance(dto.balance);
		acc.setCity(dto.city);
		acc.setDob(dto.dob);
		acc.setEmail(dto.email);
		acc.setFather(dto.father);
		acc.setFirstname(dto.firstname);
		acc.setLandmark(dto.landmark);
		acc.setLastname(dto.lastname);
		acc.setMiddlename(dto.middlename);
		acc.setOccupation(dto.occupation);
		acc.setPhone(dto.phone);
		acc.setPincode(dto.pincode);
		acc.setProofId(dto.proofId);
		acc.setProofType(dto.proofType);
		acc.setState(dto.state);
		return acc;
		
	}
	
}
