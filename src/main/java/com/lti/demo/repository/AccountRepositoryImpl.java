package com.lti.demo.repository;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.demo.pojo.Account;

@Repository
public class AccountRepositoryImpl implements AccountRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void openAccount(Account accountDetails) {
		// TODO Auto-generated method stub
		entityManager.persist(accountDetails);
	}

	@Override
	public String getAccountStatus(int accountNummber) {
		// TODO Auto-generated method stub
		return  (String) entityManager.createNativeQuery("select u.ACCOUNT_STATUS from Account u where u.ACC_NO="+accountNummber).getSingleResult();
		
	}

	@Override
	public BigDecimal getAccountBalance(int accountNummber) {
		// TODO Auto-generated method stub
		return  (BigDecimal) entityManager.createNativeQuery("select u.Balance from Account u where u.ACC_NO="+accountNummber).getSingleResult();
		
	}

	@Override
	public boolean isUserValid(int AccountNummber) {
		// TODO Auto-generated method stub
		if(getAccountStatus(AccountNummber).equals("open")) {
			return true;
		}
		return false;
	}

	@Override
	public Account getAccountDetails(int accountNumber) {
		return entityManager.find(Account.class, accountNumber);
	}

	
}
