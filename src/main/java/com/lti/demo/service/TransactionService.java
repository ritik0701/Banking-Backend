package com.lti.demo.service;

import java.util.Date;
import java.util.List;

<<<<<<< HEAD
import com.lti.demo.DTO.TransactionDetailsDTO;
=======
import com.lti.demo.dto.TransactionDetailsDTO;
>>>>>>> ritik
import com.lti.demo.pojo.Transaction;

public interface TransactionService {
	void transaction(TransactionDetailsDTO td);
	List<Transaction> getMiniStatement(long accNumber);
<<<<<<< HEAD
	List<Transaction> getTransactionHistory(Date fromDate,Date toDate,String accountNumber);
=======
	List<Transaction> getTransactionHistory(Date fromDate,Date toDate,long accountNumber);
>>>>>>> ritik
	//void DepositBalance(long toAccount, BigDecimal transactionBalance);
    // void WithdrawBalance(long fromAccount, BigDecimal transactionBalance);
    Transaction findtransaction(long transactionid);
//	String changeDateFormat(String date);
<<<<<<< HEAD
}
=======
}
>>>>>>> ritik
