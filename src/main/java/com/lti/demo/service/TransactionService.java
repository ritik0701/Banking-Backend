package com.lti.demo.service;

import java.util.Date;
import java.util.List;

import com.lti.demo.DTO.TransactionDetailsDTO;
import com.lti.demo.pojo.Transaction;

public interface TransactionService {
	void transaction(TransactionDetailsDTO td);
	List<Transaction> getMiniStatement(long accNumber);
	List<Transaction> getTransactionHistory(Date fromDate,Date toDate,String accountNumber);
	//void DepositBalance(long toAccount, BigDecimal transactionBalance);
    // void WithdrawBalance(long fromAccount, BigDecimal transactionBalance);
    Transaction findtransaction(long transactionid);
//	String changeDateFormat(String date);
}
