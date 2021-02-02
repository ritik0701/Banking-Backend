package com.lti.demo;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.demo.pojo.Account;
import com.lti.demo.repository.AccountRepositoryImpl;
import com.lti.demo.repository.AdminRepositoryImpl;


@SpringBootTest
class DarkBankingApplicationTests {

	@Autowired
	AdminRepositoryImpl a;
	

	@Test
	void testUserid() {
		a.getAdminById(1001);
	}
	

	@Autowired
	AccountRepositoryImpl account;
	
	@Test
	void testSetAccountDetails() {
		Account acc =  new Account();
		acc.setAccountStatus("open");
		acc.setAddress("kalani nagar");
		acc.setAdminRemark("insert from account");
		acc.setAnnualIncome(BigDecimal.valueOf(6767.09));
		acc.setBalance(BigDecimal.valueOf(634767.09));
		acc.setBeneficiaries(null);
		acc.setCity("Indore");
		acc.setDob(new Date());
		acc.setEmail("aadish@gnail.com");
		acc.setFather("Mukesh Chhap");
		acc.setFirstname("Aadish");
		acc.setLandmark("Near School");
		acc.setLastname("Jain");
		acc.setMiddlename(null);
		acc.setOccupation("Softwre engineer");
		acc.setPhone("9337729923");
		acc.setPincode(452001);
		acc.setProofId("129239229492");
		acc.setProofType("Aadhar");
		acc.setState("MP");
		acc.setUser(null);
		
		account.openAccount(acc);
	}
}
