package com.lti.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.lti.demo.pojo.Account;

@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public void openAccountService(Account accountDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAccountStatusService(long accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal getAccountBalanceService(long accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUserValidService(long accountNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account getAccountDetailsService(long accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
