package com.lti.demo.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo.dto.MakeTransaction;
import com.lti.demo.dto.TransactionDate;
import com.lti.demo.dto.TransactionDetailsDTO;
import com.lti.demo.dto.TransactionFind;
import com.lti.demo.dto.TransactionMiniStatementDTO;
import com.lti.demo.dto.StatusDto;
import com.lti.demo.pojo.Transaction;
import com.lti.demo.service.TransactionService;

@RestController
@CrossOrigin
public class TransactionController {
	@Autowired 
	TransactionService trans;
	
	@RequestMapping(path="/getTransactions")
	public String getAllTransaction( @RequestBody TransactionDate td){
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
	public List<Transaction> getMiniStatement( @RequestBody TransactionMiniStatementDTO tf) {
		return  trans.getMiniStatement(tf);
	}
	
	@RequestMapping(path="/findtransaction")
	@ResponseBody
	public Transaction findTransaction(@RequestBody TransactionFind tf) {
		return trans.findtransaction(tf);		
	}
	
	
	@PostMapping(path="/addtransaction")
	public StatusDto addTransaction(@RequestBody MakeTransaction mt) throws Exception {
		
		try {
			return trans.transaction(mt);
			
		} 
		catch (Exception e) {
			  throw e;
		}
	}
	
}
