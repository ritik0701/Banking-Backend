package com.lti.demo.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.demo.repository.UserRepositoryImpl;
import com.lti.demo.pojo.Beneficiary;

public class AddBeneficiaryDTO {

private long beneficiaryAccNo;

	
	private String bankIfsc;

	private Date dateAdded;

	private long userId;
	
	private String beneficiaryName;
	
	
	public long getBeneficiaryAccNo() {
		return beneficiaryAccNo;
	}

	public void setBeneficiaryAccNo(long beneficiaryAccNo) {
		this.beneficiaryAccNo = beneficiaryAccNo;
	}

	public String getBankIfsc() {
		return bankIfsc;
	}

	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	
}

