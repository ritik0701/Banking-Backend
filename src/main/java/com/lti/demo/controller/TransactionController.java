package com.lti.demo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo.dto.TransactionDate;
import com.lti.demo.dto.TransactionDetailsDTO;
import com.lti.demo.dto.TransactionFind;
import com.lti.demo.dto.TransactionMiniStatementDTO;
import com.lti.demo.pojo.Transaction;
import com.lti.demo.service.TransactionService;

@RestController
@CrossOrigin() 
public class TransactionController {
	@Autowired 
	TransactionService trans;
	@RequestMapping(path="/getTransactions")
	@ResponseBody

	public String getAllTransaction( @RequestBody TransactionDate td){

	

	

		 	
//		  Date date1 = null;
//		try {
//			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(fromDate);
//		} catch (ParseException e) {
//			
//			e.printStackTrace();
//		}  
//		  Date date2 = null;
//		try {
//			date2 = new SimpleDateFormat("dd/MM/yyyy").parse(toDate);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 

		

		String res="";
		List<Transaction> transaction=trans.getTransactionHistory(td);
		Iterator <Transaction> ts =transaction.iterator(); 
		
		 while(ts.hasNext())
			{
			 
			 res =res+ " "+(ts.next().getTransactionId()); 
					
			}
		return res;
	}
	
	@RequestMapping(path="/ministatement")
	@ResponseBody

	public String getMiniStatement( @RequestBody TransactionMiniStatementDTO tf) {
		

		List<Transaction> transaction=  trans.getMiniStatement(tf);
		String res="";
		 Iterator <Transaction> ts =transaction.iterator(); 
			
		 while(ts.hasNext())
			{
			 
			 res =res+ " "+(ts.next().getTransactionId()); 
					
			}
			return res;

			
			

	}
	
	@RequestMapping(path="/findtransaction")
	@ResponseBody
	public Transaction findTransaction(@RequestBody TransactionFind tf) {
		return trans.findtransaction(tf);		
		 
	
		

	}
	
	/*
	@RequestMapping(path="/Deposite")
	@ResponseBody
	public String depositemoney(long toAccount, BigDecimal transactionBalance) {
		
		trans.DepositBalance(toAccount, transactionBalance);
		
	String res="Working";
		return res;
<<<<<<< HEAD

=======
>>>>>>> ritik
	}
	@RequestMapping(path="/Withdraw")
	@ResponseBody
	public String findTransactionss(long toAccount, BigDecimal transactionBalance) {
		
		trans.WithdrawBalance(toAccount, transactionBalance);
	String res="Working";
		return res;
<<<<<<< HEAD

=======
>>>>>>> ritik
	}
	
*/
	@PostMapping(path="/addtransaction")
	public String addTransaction(@RequestBody TransactionDetailsDTO ts) {
	
		try {
			trans.transaction(ts);
			
			return "add sucssessfully";
			
		} 
		catch (Exception e) {
			  e.printStackTrace();
			  return "Error while transactions";
		}
		
		
		
		

	}
	
	
	
	
	


}
