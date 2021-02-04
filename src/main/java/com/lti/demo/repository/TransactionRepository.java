
package com.lti.demo.repository;

import java.util.Date;
import java.util.List;


import com.lti.demo.pojo.Transaction;

public interface TransactionRepository {
	void save(Transaction transaction);
	List<Transaction> getAllRecords(int accNumber);
	List<Transaction> getTransactionBetweenDates(Date fromDate,Date toDate,String accountnumber);
	Object getTransactionById(long transactionId);
}