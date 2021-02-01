package com.lti.repository;

import com.lti.pojo.Account;

public interface AccountRepository {

	public void openAccount(Account accountDetails) ;
	
	//getAccountNumber
	
	public String getAccountStatus(int accountNumber);
	
	public double getAccountBalance(int accountNumber);
	
	public boolean isUserValid(int accountNumber);
	
	public Account getAccountDetails(int accountNumber);
	
}
