package com.lti.demo.service;

import java.util.Date;
import java.util.List;

import com.lti.demo.dto.MakeTransaction;
import com.lti.demo.dto.StatusDto;
import com.lti.demo.dto.TransactionDate;
import com.lti.demo.dto.TransactionDetailsDTO;
import com.lti.demo.dto.TransactionFind;
import com.lti.demo.dto.TransactionMiniStatementDTO;
import com.lti.demo.pojo.Transaction;

public interface TransactionService {
	

	List<Transaction> getMiniStatement(TransactionMiniStatementDTO ts);
	List<Transaction> getTransactionHistory(TransactionDate td);

	

	//void DepositBalance(long toAccount, BigDecimal transactionBalance);
    // void WithdrawBalance(long fromAccount, BigDecimal transactionBalance);
    Transaction findtransaction(TransactionFind tf);
//	String changeDateFormat(String date);

	StatusDto transaction(MakeTransaction mt) throws Exception;

}
