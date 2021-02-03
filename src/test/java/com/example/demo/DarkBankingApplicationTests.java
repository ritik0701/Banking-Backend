package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.pojo.Account;
import com.lti.repository.AccountRepository;
import com.lti.repository.AccountRepositoryImpl;

@SpringBootTest
class DarkBankingApplicationTests {

	@Test
	void testAccountBalance() {
		AccountRepositoryImpl ar = new AccountRepositoryImpl();
		ar.getAccountBalance(1000000000);
	}
	
	
	

}
