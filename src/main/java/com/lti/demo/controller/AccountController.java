package com.lti.demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo.pojo.Account;
import com.lti.demo.service.AccountService;

@RestController
@CrossOrigin
public class AccountController {

	@Autowired
	AccountService accountService;
	
	
	//GetMapping
	//PostMapping
	@RequestMapping(path="/openaccount")
	@ResponseBody
	public String openAccount(@RequestBody Account account) {
		accountService.openAccountService(account);
		return "account opened";
	}
	
	@RequestMapping(path="/accountstatus")
	@ResponseBody
	public String getAccountStatus(long  x) {
		return "open :"+accountService.getAccountStatusService(x);
	}
	
	@RequestMapping(path="/validateuser")
	@ResponseBody
	public String isUserValid(long  x) {
		return accountService.isUserValidService(x);
	}
	
	@RequestMapping(path="/accountbalance")
	@ResponseBody
	public BigDecimal getAccountBalance(@RequestBody Long  x) {
		return accountService.getAccountBalanceService(x.longValue());
	}
	
	@RequestMapping(path="/accountdetails")
	@ResponseBody
	public Account getAccountDetails(long  x) {
		return accountService.getAccountDetailsService(x);
	}
	
	
}

