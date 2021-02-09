package com.lti.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.lti.demo.pojo.Account;

public interface AccountService {

	public String openAccountService(Account accountDetails) ;
	
	//getAccountNumber
	
	public String getAccountStatusService(long accountNumber);
	
	public BigDecimal getAccountBalanceService(long accountNumber);
	
	public String isUserValidService(long accountNumber);
	
	public Account getAccountDetailsService(long accountNumber);

	List<Account> getNewAccountDetailsService();
	
}
