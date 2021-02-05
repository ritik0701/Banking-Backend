package com.lti.demo.repository;

import java.util.Date;
import java.util.List;

import com.lti.demo.pojo.Admin;
import com.lti.demo.pojo.Transaction;

public interface TransactionRepository {
	void save(Transaction transaction);
	List<Transaction> getAllRecords(long accNumber);
	List<Transaction> getTransactionBetweenDates(Date fromDate,Date toDate,long accountnumber);
	Transaction getTransactionById(long transactionId);
}