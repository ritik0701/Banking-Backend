package com.lti.demo.repository;

import java.util.Date;
import java.util.List;

import com.lti.demo.pojo.Admin;
import com.lti.demo.pojo.Transaction;

public interface TransactionRepository {
<<<<<<< HEAD
	boolean isTransactionPresent();
	void save(Transaction transaction);
	Long getTransactionId();
	List<Transaction> getAllRecords(int accNumber);
	List<Transaction> getTransactionBetweenDates(String fromDate,String toDate,String accountnumber);
	Transaction getTransactionById(long transactionId);
=======
	void save(Transaction transaction);
	List<Transaction> getAllRecords(int accNumber);
	List<Transaction> getTransactionBetweenDates(Date fromDate,Date toDate,String accountnumber);
	Object getTransactionById(long transactionId);
>>>>>>> master
}
