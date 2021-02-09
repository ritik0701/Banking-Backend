package com.lti.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.demo.pojo.Account;

import com.lti.demo.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountRepository accountRepo;
	
	
	@Override
	public String openAccountService(Account accountDetails) {
		// TODO Auto-generated method stub
		try {
			accountRepo.openAccount(accountDetails);	
			return "Account Application Successful";
		}catch(Exception e) {
			return "Account Application Failed";
		}
	}

	@Override
	public String getAccountStatusService(long accountNumber) {
		// TODO Auto-generated method stub
		return accountRepo.getAccountStatus(accountNumber);
	}

	@Override
	public BigDecimal getAccountBalanceService(long accountNumber) {
		// TODO Auto-generated method stub
		return accountRepo.getAccountBalance(accountNumber);
	}

	@Override
	public String isUserValidService(long accountNumber) {
		// TODO Auto-generated method stub
		if( accountRepo.isUserValid(accountNumber)) {
		    return "Valid";
		}
		return "Invalid";
	}

	@Override
	public Account getAccountDetailsService(long accountNumber) {
		// TODO Auto-generated method stub
		Account account = accountRepo.getAccountDetails(accountNumber);
		return account;
	}
	
	@Override
	public List<Account> getNewAccountDetailsService() {
		// TODO Auto-generated method stub
		List<Account> accounts = accountRepo.getNewAccounts();
		return accounts;
	}

}
