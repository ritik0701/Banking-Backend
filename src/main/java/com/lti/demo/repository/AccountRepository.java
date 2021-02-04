package com.lti.demo.repository;

import com.lti.demo.pojo.Account;

public interface AccountRepository {

	public void openAccount(Account accountDetails) ;
	
	//getAccountNumber
	
	public String accountStatus(int accountNummber);
	
	public double accountBalance(int accountNummber);
	
	public boolean isUserValid(int AccountNummber);
	
}
