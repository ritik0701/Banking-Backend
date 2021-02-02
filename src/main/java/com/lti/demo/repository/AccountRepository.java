package com.lti.demo.repository;

import java.math.BigDecimal;

import com.lti.demo.pojo.Account;

public interface AccountRepository {

	public void openAccount(Account accountDetails) ;
	
	//getAccountNumber
	
	public String getAccountStatus(int accountNumber);
	
	public BigDecimal getAccountBalance(int accountNumber);
	
	public boolean isUserValid(int accountNumber);
	
	public Account getAccountDetails(int accountNumber);
	
}
