package com.lti.demo.service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.demo.dto.TransactionDetailsDTO;
import com.lti.demo.exception.ServiceException;
import com.lti.demo.pojo.Account;
import com.lti.demo.pojo.Transaction;
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
	public List<Transaction> getMiniStatement(long accNumber) {
			List<Transaction> transactions=repo.getAllRecords(accNumber);
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
	public List<Transaction> getTransactionHistory(Date fromDate, Date toDate, long accountNumber) {
		return repo.getTransactionBetweenDates(fromDate, toDate, accountNumber);
	}
	@Transactional
	@Override
	public void transaction(TransactionDetailsDTO td) {
		Transaction t= new Transaction();
		String ttype;
		ttype=td.getDbOrCr();
		if(ttype=="DB"||ttype=="db")
		{
			
			long acno=td.getAccNo();
			BigDecimal curBalance=balancerepo.getAccountBalance(acno);
			BigDecimal transactionBalance =td.getTransactionAmount();
		
		    WithdrawBalance( acno, transactionBalance); 
		}
		else{
			long acno=td.getAccNo();
			BigDecimal curBalance=balancerepo.getAccountBalance(acno);
			BigDecimal transactionBalance =td.getTransactionAmount();
			DepositeBalance(acno,transactionBalance);
			
		}
		t.setBeneficiaryAcctNo(td.getBeneficiaryAcctNo());
		t.setBeneficiaryName(td.getBeneficiaryName());
		t.setDbOrCr(td.getDbOrCr());
		
		t.setTransactionAmount(td.getTransactionAmount());
		
		t.setTransactionType(td.getTransactionType());
		t.setTransactionDate(new Date());
		Account a =new Account();
		a=balancerepo.getAccountDetails(td.getAccNo());
		t.setAccount(a);
		repo.save(t);
	}
	@Override
	public Transaction findtransaction(long transactionid) {
		
		return repo.getTransactionById(transactionid);
		
	}
	

	

	
}