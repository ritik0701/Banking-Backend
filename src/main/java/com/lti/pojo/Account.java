package com.lti.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account 
{
	@Id
	@Column(length = 9, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String Account_no;
	
	@Column(length = 20, nullable = false)
	private String firstName;
	
	@Column(length = 20)
	private String middleName;
	
	@Column(length = 20)
	private String lastName;
	
	@Column(length = 30, nullable = false)
	private String email;
	
	@Column(length = 10, nullable = false)
	private String mobileNumber;
	
	@Column(length = 20, nullable = false)
	private double accountBalance;
	
	@Column(length = 20)
	private String fatherName;
	
	@Column(length = 20)
	private int proofTypeID;
	
	@Column(length = 20, nullable = false)
	private String proofID;
	
	@Column(length = 10, nullable = false)
	private String dob;
	
	@Column(length = 30)
	private String Address;
	
	@Column(length = 15)
	private String LandMark;
	
	@Column(length = 15)
	private String State;
	
	@Column(length = 15)
	private String City;
	
	@Column(length = 6)
	private int Pincode;
	
	@Column(length = 20)
	private String occupation;
	
	@Column(length = 20)
	private String annualIncome;
	
	@Column(length = 10, nullable = false)
	private int accountStatus;
	
	public String getAccount_no() {
		return Account_no;
	
	}
	public void setAccount_no(String account_no) {
		Account_no = account_no;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public int getProofTypeID() {
		return proofTypeID;
	}
	public void setProofTypeID(int proofTypeID) {
		this.proofTypeID = proofTypeID;
	}
	public String getProofID() {
		return proofID;
	}
	public void setProofID(String proofID) {
		this.proofID = proofID;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getLandMark() {
		return LandMark;
	}
	public void setLandMark(String landMark) {
		LandMark = landMark;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	public int getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(int accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getAdminRemark() {
		return AdminRemark;
	}
	public void setAdminRemark(String adminRemark) {
		AdminRemark = adminRemark;
	}
	@Column(length = 20)
	private String AdminRemark;
	
	
}
