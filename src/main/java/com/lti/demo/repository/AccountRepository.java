package com.lti.demo.repository;

import java.math.BigDecimal;

import com.lti.demo.pojo.Account;

public interface AccountRepository {

	public void openAccount(Account accountDetails) ;
	
	//getAccountNumber
	
	public String getAccountStatus(long accountNumber);
	
	public BigDecimal getAccountBalance(long accountNumber);
	
	public boolean isUserValid(long accountNumber);
	
	public Account getAccountDetails(long accountNumber);
	
	public void updateBalance(BigDecimal updatedBalance,long accountNumber);
	
}