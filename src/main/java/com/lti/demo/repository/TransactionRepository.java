package com.lti.demo.repository;

import java.util.Date;
import java.util.List;

import com.lti.demo.pojo.Admin;
import com.lti.demo.pojo.Transaction;

public interface TransactionRepository {
	boolean isTransactionPresent();
	void save(Transaction transaction);
	Long getTransactionId();
	List<Transaction> getAllRecords(int accNumber);
	List<Transaction> getTransactionBetweenDates(String fromDate,String toDate,String accountnumber);
	Transaction getTransactionById(long transactionId);
}
