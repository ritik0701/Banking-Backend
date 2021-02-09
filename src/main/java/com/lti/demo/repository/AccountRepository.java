package com.lti.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import com.lti.demo.pojo.Account;

public interface AccountRepository {

	public void openAccount(Account accountDetails) ;
	
	//getAccountNumber
	
	public String getAccountStatus(long accountNumber);
	
	public BigDecimal getAccountBalance(long accountNumber);
	
	public boolean isUserValid(long accountNumber);
	
	public Account getAccountDetails(long accountNumber);
	
	public void updateBalance(BigDecimal updatedBalance,long accountNumber);

	List<Account> getNewAccounts();

	//refresh account table
	void updateAccount(Account account);
	
}