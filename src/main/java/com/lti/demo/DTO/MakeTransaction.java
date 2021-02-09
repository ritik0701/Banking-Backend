package com.lti.demo.dto;

import java.math.BigDecimal;

public class MakeTransaction {
	private String transactionType;
	private long beneficiaryId ;
    private BigDecimal amount ;
    private Integer transactionPassword;
    
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public long getBeneficiaryId() {
		return beneficiaryId;
	}
	public void setBeneficiaryId(long beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Integer getTransactionPassword() {
		return transactionPassword;
	}
	public void setTransactionPassword(Integer transactionPassword) {
		this.transactionPassword = transactionPassword;
	}
}
