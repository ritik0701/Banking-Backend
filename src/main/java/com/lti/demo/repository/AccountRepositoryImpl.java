package com.lti.demo.repository;

import java.math.BigDecimal;
import java.util.List;

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
	public String getAccountStatus(long accountNummber) {
		// TODO Auto-generated method stub
		return  (String) entityManager.createNativeQuery("select u.ACCOUNT_STATUS from Account u where u.ACC_NO= :accNumber").setParameter("accNumber",accountNummber).getSingleResult();
		
	}

	@Override
	public BigDecimal getAccountBalance(long accountNummber) {
		// TODO Auto-generated method stub
		return  (BigDecimal) entityManager.createNativeQuery("select u.Balance from Account u where u.ACC_NO= :accNumber").setParameter("accNumber",accountNummber).getSingleResult();
		
	}

	@Override
	public boolean isUserValid(long AccountNummber) {
		// TODO Auto-generated method stub
		if(getAccountStatus(AccountNummber).equals("open")) {
			return true;
		}
		return false;
	}

	@Override
	public Account getAccountDetails(long accountNumber) {
		return entityManager.find(Account.class, accountNumber);
	}

	@Override
	public void updateBalance(BigDecimal updatedBalance, long accountNumber) {
		// TODO Auto-generated method stub
		 entityManager.createNativeQuery("update account set balance= :updatedBalance where ACC_NO= :accNumber")
		 .setParameter("updatedBalance", updatedBalance)
		 .setParameter("accNumber", accountNumber).executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> getNewAccounts() {
		return entityManager.createNativeQuery("select * from Account u where u.account_status = :status").setParameter("status", "Inprogress").getResultList();
		
	}
	
	@Override
	@Transactional
	public void updateAccount(Account account) {
		entityManager.refresh(account);
	}
	

	
}