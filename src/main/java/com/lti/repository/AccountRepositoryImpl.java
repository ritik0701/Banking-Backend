package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.pojo.Account;

@Repository
public class AccountRepositoryImpl implements AccountRepository{

	@PersistenceContext
	EntityManager entityManager;

	@Override
	@Transactional
	public void openAccount(Account accountDetails) {
		// TODO Auto-generated method stub
		entityManager.persist(accountDetails);
	}

	@Override
	public String getAccountStatus(int accountNummber) {
		// TODO Auto-generated method stub
		return (String)entityManager.createNamedQuery("getAccountStatus").setParameter("accNumber",accountNummber)
				.getSingleResult();
	}

	@Override
	public double getAccountBalance(int accountNummber) {
		// TODO Auto-generated method stub
		return (Double)entityManager.createNamedQuery("getBalance").setParameter("accNumber",accountNummber)
				.getSingleResult();
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
