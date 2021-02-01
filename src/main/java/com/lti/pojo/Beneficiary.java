package com.lti.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Beneficiary")
public class Beneficiary {
	
	@Id
	@Column(name="beneficiary_id",nullable=false)
	private int Beneficiary_Id ;
	@Column(name="user_acc_no",nullable=false)
	private int User_Acc_No ;
	@Column(name="beneficiary_acc_no",nullable=false)
	private int Beneficiary_Acc_No ;
	@Column(name="beneficiary_name",length=30,nullable=false)
	private String Beneficiary_Name;
	@Column(name="bank_name",length=20,nullable=false)
	private String Bank_Name ;
	@Column(name="bank_ifsc",length=20,nullable=false)
	private String Bank_IFSC;
	@Column(name="date_added",nullable=false)
	private String Date_Added ;
	public int getBeneficiary_Id() {
		return Beneficiary_Id;
	}
	public void setBeneficiary_Id(int beneficiary_Id) {
		Beneficiary_Id = beneficiary_Id;
	}
	public int getUser_Acc_No() {
		return User_Acc_No;
	}
	public void setUser_Acc_No(int user_Acc_No) {
		User_Acc_No = user_Acc_No;
	}
	public int getBeneficiary_Acc_No() {
		return Beneficiary_Acc_No;
	}
	public void setBeneficiary_Acc_No(int beneficiary_Acc_No) {
		Beneficiary_Acc_No = beneficiary_Acc_No;
	}
	public String getBeneficiary_Name() {
		return Beneficiary_Name;
	}
	public void setBeneficiary_Name(String beneficiary_Name) {
		Beneficiary_Name = beneficiary_Name;
	}
	public String getBank_Name() {
		return Bank_Name;
	}
	public void setBank_Name(String bank_Name) {
		Bank_Name = bank_Name;
	}
	public String getBank_IFSC() {
		return Bank_IFSC;
	}
	public void setBank_IFSC(String bank_IFSC) {
		Bank_IFSC = bank_IFSC;
	}
	public String getDate_Added() {
		return Date_Added;
	}
	public void setDate_Added(String date_Added) {
		Date_Added = date_Added;
	}
	
}

