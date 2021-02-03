package com.lti.demo;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.query.Param;

import com.lti.demo.pojo.Account;
import com.lti.demo.pojo.Transaction;
import com.lti.demo.pojo.User;
import com.lti.demo.repository.AccountRepositoryImpl;
import com.lti.demo.repository.AdminRepositoryImpl;
import com.lti.demo.repository.TransactionRepositoryImpl;


@SpringBootTest
class DarkBankingApplicationTests {

	@Autowired
	AdminRepositoryImpl a;
	@Autowired
	TransactionRepositoryImpl transrepo;
	

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
	@Test
	void GetAllTransaction() {
	
		System.out.println("running test : transrepo : "+transrepo);
		List<Transaction> trans; 
		
		trans = transrepo.getAllRecords(100000000);
		for (Transaction ts : trans) {
			System.out.println(" Transaction id"+ts.getTransactionId());
			
			System.out.println(" Beneficiary Account No."+ts.getBeneficiaryAcctNo());
			
		}
			
	}
	
	@Test
	void SaveTransaction() {
		
		
		System.out.println("running test : TransRepo : "+ transrepo );
		Transaction t1 =  new Transaction();
		t1.setTransactionId(9004);
		Account a = new Account();
		User u = new User();
		a.setAccNo(100000000);
	     //u.getAccount();
		//t1.setUser(u);
	//	u.getAccount();
		//t1.setUser(u);
		
	//	t1.setDbOrCr("db");
		Date date =new Date();
	//	date.getDate();
	//	@Param("datetime") Date datetime);
		t1.setTransactionDate(date);
		t1.setBeneficiaryName("b1");
		t1.setTransactionAmount(BigDecimal.valueOf(500));
		t1.setTransactionType("Neft");
		t1.setBeneficiaryAcctNo(BigDecimal.valueOf(987654321));
		
		transrepo.save(t1);
		
	}
	@Test
	void GetbetweenTransaction() {
	
		System.out.println("running test : transrepo : "+transrepo);
		List<Transaction> trans; 
		Date date =new Date();
		trans = transrepo.getTransactionBetweenDates("31-DEC-20", "03-FEB-21", "100000000");
		for (Transaction ts : trans) {
			System.out.println(" Transaction id"+ts.getTransactionId());
			
			System.out.println(" Beneficiary Account No."+ts.getBeneficiaryAcctNo());
			
		}
			
	}
	@Test
	void testTransactionid() {
		transrepo.getTransactionById(9001);
	}
	@Test 
	void isEmpty() {
		transrepo.isTransactionPresent();
	} 
	@Test
	void findtrans()
	{
		transrepo.getTransactionId();
	}
}
