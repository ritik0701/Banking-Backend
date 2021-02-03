package com.lti.demo;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.query.Param;

import com.lti.demo.pojo.Account;
<<<<<<< HEAD
import com.lti.demo.pojo.Transaction;
import com.lti.demo.pojo.User;
import com.lti.demo.repository.AccountRepositoryImpl;
import com.lti.demo.repository.AdminRepositoryImpl;
import com.lti.demo.repository.TransactionRepositoryImpl;
=======
import com.lti.demo.pojo.Admin;
import com.lti.demo.pojo.Beneficiary;
import com.lti.demo.pojo.User;
import com.lti.demo.pojo.Transaction;

import com.lti.demo.repository.AccountRepositoryImpl;
import com.lti.demo.repository.AdminRepositoryImpl;
import com.lti.demo.repository.BeneficiaryRepositoryImpl;
import com.lti.demo.repository.TransactionRepositoryImpl;
import com.lti.demo.repository.UserRepositoryImpl;
>>>>>>> master


@SpringBootTest
class DarkBankingApplicationTests {

<<<<<<< HEAD
	@Autowired
	AdminRepositoryImpl a;
	@Autowired
	TransactionRepositoryImpl transrepo;
	

	@Test
	void testUserid() {
		a.getAdminById(1001);
	}
=======
	//Ritik-------------------------------------------------------------------------------
>>>>>>> master
	
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
		acc.setCity("Indore");
		acc.setDob(new Date());
		acc.setEmail("aadish123@gnail.com");
		acc.setFather("Mukesh Chhap");
		acc.setFirstname("Ritik");
		acc.setLandmark("Near School");
		acc.setLastname("Jain");
		acc.setMiddlename(null);
		acc.setOccupation("Softwre engineer");
		acc.setPhone("9337729953");
		acc.setPincode(452001);
		acc.setProofId("129239229492");
		acc.setProofType("Aadhar");
		acc.setState("MP");
		acc.setUser(null);
		account.openAccount(acc);
	}
<<<<<<< HEAD
=======
	
	@Test
	void testGetAccountDetails() {
		account.getAccountDetails(100000000);
	}
	
	@Test 
	void testIsUserValid() {
		account.isUserValid(100000000);
	}
	
	@Test 
	void testGetAccountStatus() {
		account.getAccountStatus(100000000);
	}
	
	@Test 
	void testGetAccountBalance() {
		account.getAccountBalance(100000000);
	}
	
	@Test 
	void testUpdateBalance() {
		account.updateBalance(BigDecimal.valueOf(9000),100000000);
	}
	
	//Ketki------------------------------------------------------------------------
	
	@Autowired
	UserRepositoryImpl userrepo;
	
	//insert data//working
	@Test
	void SaveUser() {
		System.out.println("running test : UserRepo : "+ userrepo );
		User u1=new User();
		u1.setPass("user@123");
		u1.setAccount(null);
		u1.setTransaction_Password(1111);
		userrepo.save(u1);
		
	}
	//get all user
	//get userDetails By ID//working
	@Test
	void getUserbyId()
	{
	System.out.println(userrepo.findUserById(10000));
	}
	//get user By Accno//working
	@Test
	void getAccno() {
		System.out.println("getting user");
		userrepo.getUserByAccountNumber(100000000);
	}
	//get Transaction password by accno//working
	@Test
	void getTransPass() {
		System.out.println("getting transaction pass");
		userrepo.getTransactionPassword(100000000);
	}
	//validation of user id and pass
	@Test
	void validUserIdPassword()
	{
		System.out.println(userrepo.validUserIdPassword(500000, "user@123"));
	}
	@Test
	void isUserValid() 
	{
		System.out.println(userrepo.isUserValid(500000));
	}
	
	//AAdish---------------------------------------------------------------------------------------
	
	@Autowired
	AdminRepositoryImpl ar;	
	
	@Test
	void getAdmin() {
		ar.getAdminById(1001);
		System.out.println("running test : AdminRepo :" +ar);
	
	}
	
	@Test
	void getAdminPassword() {
		System.out.println(ar.getPasswordById(1001));
	
	}
	
	
	@Autowired
	BeneficiaryRepositoryImpl br;
	
	@Test
	void saveBeneficiary() {
		
		Beneficiary beneficiary = new Beneficiary();
		beneficiary.setBankIfsc("HDFC3498");
		beneficiary.setBeneficiaryAccNo(432589898);
		beneficiary.setBeneficiaryName("Deepraj");
		beneficiary.setDateAdded(new Date());
		beneficiary.setUser(userrepo.findUserById(10000));
		
		br.save(beneficiary);
	}
	
	@Test
	void getBeneficiary() {
		System.out.println(br.getBeneficiaryList(10000));
}
	
	//Deepraj------------------------------------------------------------------------------------
	


	@Autowired
	TransactionRepositoryImpl transrepo;
	
>>>>>>> master
	@Test
	void GetAllTransaction() {
	
		System.out.println("running test : transrepo : "+transrepo);
<<<<<<< HEAD
		List<Transaction> trans; 
=======
		List< Transaction > trans; 
>>>>>>> master
		
		trans = transrepo.getAllRecords(100000000);
		for (Transaction ts : trans) {
			System.out.println(" Transaction id"+ts.getTransactionId());
			
			System.out.println(" Beneficiary Account No."+ts.getBeneficiaryAcctNo());
			
		}
			
	}
	
	@Test
	void SaveTransaction() {
		
<<<<<<< HEAD
		
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
=======
		System.out.println("running test : TransRepo : "+ transrepo );
		Transaction t1 =  new Transaction();
		t1.setAccount(account.getAccountDetails(100000000));
		t1.setBeneficiaryAcctNo(BigDecimal.valueOf(100032002));
		t1.setBeneficiaryName("Vishal D");
		t1.setDbOrCr("db");
		t1.setTransactionAmount(BigDecimal.valueOf(10000.0));
		t1.setTransactionDate(new Date());
		t1.setTransactionType("NEFT");
		transrepo.save(t1);
		
	}

	
>>>>>>> master
	@Test
	void GetbetweenTransaction() {
	
		System.out.println("running test : transrepo : "+transrepo);
		List<Transaction> trans; 
<<<<<<< HEAD
		Date date =new Date();
		trans = transrepo.getTransactionBetweenDates("31-DEC-20", "03-FEB-21", "100000000");
=======
		 String sDate1="31/1/2021";  
		 String sDate2="3/2/2021";  
		  Date date1 = null;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		  Date date2 = null;
		try {
			date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		trans = transrepo.getTransactionBetweenDates(date1, date2, "100000000");
>>>>>>> master
		for (Transaction ts : trans) {
			System.out.println(" Transaction id"+ts.getTransactionId());
			
			System.out.println(" Beneficiary Account No."+ts.getBeneficiaryAcctNo());
			
		}
			
	}
	@Test
	void testTransactionid() {
<<<<<<< HEAD
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
=======
		System.out.println(transrepo.getTransactionById(90001));
	}
	
>>>>>>> master
}
