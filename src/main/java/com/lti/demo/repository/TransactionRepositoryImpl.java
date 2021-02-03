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
<<<<<<< HEAD
	@Override
	public boolean isTransactionPresent() {
		// TODO Auto-generated method stub
		
		
	return (Long)em.createNamedQuery("isTableEmpty")
				.getSingleResult()==0 ? true:false;
	}
	@Override
	@Transactional
	public void save(Transaction transaction) {
		
		em.persist(transaction);
	}
	@Override
	public Long getTransactionId() {
		// TODO Auto-generated method stub
		
		return (Long)em.createNamedQuery("getTransactionId")
				.getSingleResult();
	}
	@Override
	@Transactional
	public List<Transaction> getAllRecords(int accNumber) {
		
		String queryString = "select t from Transaction t where t.user = "+accNumber;
		List<Transaction> translist = em.createQuery(queryString).getResultList();
	    
		return translist;
		
		
	}
	@Override
	public List<Transaction> getTransactionBetweenDates(String fromDate, String toDate, String accountnumber) {
		// TODO Auto-generated method stub
		System.out.println(fromDate);
		System.out.println(toDate);
		System.out.println(accountnumber);
		//String queryString = "select t from Transaction t where t.user = "+accountnumber;
		 String qr="select t from Transaction where t.transactionDate >= " +fromDate +" and t.transactionDate <="+ toDate;
		// String qr="select t from Transaction where (t.transactionDate BETWEEN :fromDate AND :toDate) and accNum = :accNumber";
		 //qr.setParameter("fromDate",fromDate).setParameter("toDate",toDate).setParameter("accNumber",accountnumber).getResultList();
		 
		// String qr2="select t from Transaction where (date_field BETWEEN ':fromDate' AND ':toDate') and accNum = :accNumber;
		return em.createQuery(qr).getResultList();
	}
	@Override
	public Transaction getTransactionById(long transactionId) {
		
		return em.find(Transaction.class, transactionId);
=======
	
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
>>>>>>> master
	}

}
