package com.lti.demo.repository;

import java.util.Date;
import java.util.List;

import com.lti.demo.pojo.Transaction;

public interface TransactionRepository {



	void save(Transaction transaction);
	List<Transaction> getAllRecords(long accNumber);

	Transaction getTransactionById(long transactionId);



	List<Transaction> getTransactionBetweenDates(Date fromDate,Date toDate,long accountnumber);
	
}

