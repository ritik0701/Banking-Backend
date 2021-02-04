package com.lti.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transactions")
public class Transaction {
	@Id
	@Column(name="transaction_id",nullable=false)
	 private int Transaction_Id; 
	@Column(name="User_Account_no", nullable = false)
	private String User_Account_no;
	@Column(name="beneficiary_acct_no",nullable=false)
	private int Beneficiary_Acct_No; 
	@Column(name="beneficiary_name",nullable=false)
    private String Beneficiary_Name;
	public int getTransaction_Id() {
		return Transaction_Id;
	}
	public void setTransaction_Id(int transaction_Id) {
		Transaction_Id = transaction_Id;
	}
	public String getUser_Account_no() {
		return User_Account_no;
	}
	public void setUser_Account_no(String user_Account_no) {
		User_Account_no = user_Account_no;
	}
	public int getBeneficiary_Acct_No() {
		return Beneficiary_Acct_No;
	}
	public void setBeneficiary_Acct_No(int beneficiary_Acct_No) {
		Beneficiary_Acct_No = beneficiary_Acct_No;
	}
	public String getBeneficiary_Name() {
		return Beneficiary_Name;
	}
	public void setBeneficiary_Name(String beneficiary_Name) {
		Beneficiary_Name = beneficiary_Name;
	}
	public int getTransaction_Type() {
		return Transaction_Type;
	}
	public void setTransaction_Type(int transaction_Type) {
		Transaction_Type = transaction_Type;
	}
	public int getTransaction_Amount() {
		return Transaction_Amount;
	}
	public void setTransaction_Amount(int transaction_Amount) {
		Transaction_Amount = transaction_Amount;
	}
	@Column(name="transaction_type",nullable=false)
	private int Transaction_Type; 
	@Column(name="transaction_amount",nullable=false)
	private int Transaction_Amount; 
}
