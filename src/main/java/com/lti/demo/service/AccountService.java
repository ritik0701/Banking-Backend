package com.lti.demo.service;

import java.math.BigDecimal;

import com.lti.demo.pojo.Account;

public interface AccountService {

	public void openAccountService(Account accountDetails) ;
	
	//getAccountNumber
	
	public String getAccountStatusService(long accountNumber);
	
	public BigDecimal getAccountBalanceService(long accountNumber);
	
	public boolean isUserValidService(long accountNumber);
	
	public Account getAccountDetailsService(long accountNumber);
	
}
