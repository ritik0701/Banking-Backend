package com.lti.demo.dto;

import java.math.BigDecimal;
import java.util.Date;


import com.lti.demo.pojo.Account;
import com.lti.demo.pojo.Transaction;

public class TransactionDetailsDTO {
	private long transactionId;
	private BigDecimal beneficiaryAcctNo;
	private String beneficiaryName;
	private String dbOrCr;
	private BigDecimal transactionAmount;
	private Date transactionDate;
	private String transactionType;
	private long accNo;
	
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public BigDecimal getBeneficiaryAcctNo() {
		return beneficiaryAcctNo;
	}
	public void setBeneficiaryAcctNo(BigDecimal beneficiaryAcctNo) {
		this.beneficiaryAcctNo = beneficiaryAcctNo;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public String getDbOrCr() {
		return dbOrCr;
	}
	public void setDbOrCr(String dbOrCr) {
		this.dbOrCr = dbOrCr;
	}
	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	
	public TransactionDetailsDTO convertTransactionToDTO(Transaction transaction) {
		this.setAccNo(transaction.getAccount().getAccNo());
		this.setBeneficiaryAcctNo(transaction.getBeneficiaryAcctNo());
		this.setBeneficiaryName(transaction.getBeneficiaryName());
		this.setDbOrCr(transaction.getDbOrCr());
		this.setTransactionAmount(transaction.getTransactionAmount());
		this.setTransactionDate(transaction.getTransactionDate());
		this.setTransactionId(transaction.getTransactionId());
		this.setTransactionType(transaction.getTransactionType());
		
		return this;
	}
}
