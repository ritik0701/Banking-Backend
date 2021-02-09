package com.lti.demo.service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.demo.dto.MakeTransaction;
import com.lti.demo.dto.StatusDto;
import com.lti.demo.dto.TransactionDate;
import com.lti.demo.dto.TransactionDetailsDTO;
import com.lti.demo.dto.TransactionFind;
import com.lti.demo.dto.TransactionMiniStatementDTO;
import com.lti.demo.exception.ServiceException;
import com.lti.demo.pojo.Account;
import com.lti.demo.pojo.Beneficiary;
import com.lti.demo.pojo.Transaction;
import com.lti.demo.pojo.User;
import com.lti.demo.repository.AccountRepository;
import com.lti.demo.repository.BeneficiaryRepository;
import com.lti.demo.repository.TransactionRepository;
import com.lti.demo.repository.UserRepository;



@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	AccountRepository balancerepo;
	@Autowired
	TransactionRepository repo;
	@Autowired
	BeneficiaryRepository benrepo;
	@Autowired
	UserRepository userrepo;
	
	
	
	public void DepositeBalance(long toAccount, BigDecimal transactionBalance) {
		// TODO Auto-generated method stub
		BigDecimal curBalance=balancerepo.getAccountBalance(toAccount);
		
		curBalance=curBalance.add(transactionBalance);
		balancerepo.updateBalance(curBalance, toAccount);
		
	}

	public void WithdrawBalance(long fromAccount, BigDecimal transactionBalance) {
		// TODO Auto-generated method stub
		BigDecimal curBalance=balancerepo.getAccountBalance(fromAccount);
		if(curBalance.compareTo(transactionBalance)<0) {
			throw new ServiceException("Insufficient Funds");
		}
		else
		curBalance=curBalance.subtract(transactionBalance);
		balancerepo.updateBalance(curBalance, fromAccount);
	}

	@Override
	public List<Transaction> getMiniStatement(TransactionMiniStatementDTO ts) {
			List<Transaction> transactions=repo.getAllRecords(ts.getAccNo());
			int size = transactions.size();
			if(size<=5) {
				return transactions;
			}
			else {
			List<Transaction> last5Transactions = new ArrayList<Transaction>();
			
			for(int i=size-1;i>=(size-5);i--) {
				last5Transactions.add(transactions.get(i));
			}
			return  last5Transactions;
			}
			
		}
		
	

	@Override

	public List<Transaction> getTransactionHistory(TransactionDate td) {
		return repo.getTransactionBetweenDates(td.getFromDate(),td.getToDate(),td.getAccNo());

	
	}
	@Transactional
	@Override
	public StatusDto transaction(MakeTransaction mt) throws Exception {
		try {
		Transaction t= new Transaction();
		Beneficiary b = benrepo.getBeneficiary(mt.getBeneficiaryId());
		if(!b.getUser().getTransaction_Password().equals(mt.getTransactionPassword())) {
			throw new Exception("Transaction Password Not same");
		}
		Account a = b.getUser().getAccount();
		BigDecimal balance = a.getBalance();
		if(balance.compareTo(mt.getAmount())<0){
			throw new ServiceException("Insufficient Funds");
		}else {
		balancerepo.updateBalance(balance.subtract(mt.getAmount()), a.getAccNo());
		}
		t.setBeneficiaryAcctNo(b.getBeneficiaryAccNo());
		t.setBeneficiaryName(b.getBeneficiaryName());
		t.setDbOrCr("db");
		t.setTransactionAmount(mt.getAmount());
		t.setTransactionType(mt.getTransactionType());
		t.setTransactionDate(new Date());
		t.setAccount(a);
		repo.save(t);
		StatusDto status = new StatusDto();
		status.setStatus("success");
		return status;
		}catch(Exception e){
			throw e;
		}
	}
	@Override
	public Transaction findtransaction(TransactionFind tf) {
		
		return repo.getTransactionById(tf.getTransactionId());
		
	}
	


	

}

