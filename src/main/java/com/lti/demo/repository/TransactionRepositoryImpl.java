package com.lti.demo.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.demo.pojo.Admin;
import com.lti.demo.pojo.Transaction;

@Repository
public class TransactionRepositoryImpl implements TransactionRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public void save(Transaction transaction) {
		em.persist(transaction);
	}
	
	@Override
	public List<Transaction> getAllRecords(int accNumber) {
		String queryString = "select * from Transactions t where t.acc_no = :accNumber";
		List<Transaction> translist = em.createNativeQuery(queryString).setParameter("accNumber", accNumber).getResultList();
		return translist;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Transaction> getTransactionBetweenDates(Date fromDate, Date toDate, String accountnumber) {
		String qr="select * from Transactions where (transaction_Date BETWEEN :fromDate AND :toDate) and acc_no = :accNumber"; 
		return em.createNativeQuery(qr,Transaction.class).setParameter("fromDate",fromDate).setParameter("toDate",toDate).setParameter("accNumber",accountnumber).getResultList();
	}
	
	
	@Override
	public Object getTransactionById(long transactionId) {
		String qr="select * from Transactions where transaction_Id = :transactionId"; 
		return  em.createNativeQuery(qr).setParameter("transactionId",transactionId).getSingleResult();
	}

}
