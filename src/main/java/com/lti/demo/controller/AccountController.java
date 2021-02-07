package com.lti.demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo.dto.AccountNumberDTO;
import com.lti.demo.dto.OpenAccountDTO;
import com.lti.demo.pojo.Account;
import com.lti.demo.service.AccountService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	
	//GetMapping
	//PostMapping
	@RequestMapping(path="/openaccount")
	@ResponseBody
	public String openAccount(@RequestBody OpenAccountDTO dto) {
		Account account = dto.getAccountFromDTO(dto);
		accountService.openAccountService(account);
		return "account opened";
	}
	
	@RequestMapping(path="/accountstatus")
	@ResponseBody
	public String getAccountStatus(@RequestBody AccountNumberDTO x) {
		return "open :"+accountService.getAccountStatusService(x.getAccNo());
	}
	
	@RequestMapping(path="/validateuser")
	@ResponseBody
	public String isUserValid(@RequestBody AccountNumberDTO x) {
		return accountService.isUserValidService(x.getAccNo());
	}
	
	@PostMapping(path="/accountbalance")
	@ResponseBody
	public BigDecimal getAccountBalance(@RequestBody AccountNumberDTO x) {
		return accountService.getAccountBalanceService(x.getAccNo());
	}
	
	@RequestMapping(path="/accountdetails")
	@ResponseBody
	public Account getAccountDetails(@RequestBody AccountNumberDTO x) {
		return accountService.getAccountDetailsService(x.getAccNo());
	}
	
	
}

