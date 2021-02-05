package com.lti.demo;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.query.Param;

import com.lti.demo.pojo.Account;
import com.lti.demo.pojo.Beneficiary;
import com.lti.demo.pojo.User;
import com.lti.demo.pojo.Transaction;

import com.lti.demo.repository.AccountRepositoryImpl;
import com.lti.demo.repository.AdminRepositoryImpl;
import com.lti.demo.repository.BeneficiaryRepositoryImpl;
import com.lti.demo.repository.TransactionRepositoryImpl;
import com.lti.demo.repository.UserRepositoryImpl;



@SpringBootTest
class DarkBankingApplicationTests {


	//Ritik-------------------------------------------------------------------------------

	
	@Autowired
	AccountRepositoryImpl accountRepo;
	
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
		accountRepo.openAccount(acc);
	}

	@Test
	void testGetAccountDetails() {
		Account account = accountRepo.getAccountDetails(100000000);
		String res = "accountNumber : "+account.getAccNo() 
			  + ", firstname :" + account.getFirstname()
			  + ", middlename : "+ account.getMiddlename()
			  + ", lastname : "+ account.getLastname()
			  + ", email : "+ account.getEmail()
			  + ", phone : "+ account.getPhone()
			  + ", father : "+ account.getFather()
			  + ", balance : "+ account.getBalance()
			  + ", proof_type : "+ account.getProofType()
			  + ", proof_id : "+ account.getProofId()
			  + ", dob date : "+ account.getDob()
			  + ", address : "+ account.getAddress()
			  + ", landmark : "+ account.getLandmark()
			  + ", pincode : "+ account.getPincode()
			  + ", city : "+ account.getCity()
			  + ", state : "+ account.getState()
			  + ", occupation : "+ account.getOccupation()
			  + ", annual_income : "+ account.getAnnualIncome()
			  + ", account_status : "+ account.getAccountStatus()
			  + ", admin_remark : "+ account.getAdminRemark() ;
		System.out.print(res);
	}
	
	@Test 
	void testIsUserValid() {
		accountRepo.isUserValid(100000000);
	}
	
	@Test 
	void testGetAccountStatus() {
		accountRepo.getAccountStatus(100000000);
	}
	
	@Test 
	void testGetAccountBalance() {
		accountRepo.getAccountBalance(100000000);
	}
	
	@Test 
	void testUpdateBalance() {
		accountRepo.updateBalance(BigDecimal.valueOf(9000),100000000);
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
		u1.setAccount(account.getAccountDetails(1000000000));
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
<<<<<<< HEAD
		 userrepo.getUserByAccountNumber(100000000);
=======
		userrepo.getUserByAccNumber(100000000);
>>>>>>> ritik
	}
	//get Transaction password by accno//working
	@Test
	void getTransPass() {
		System.out.println("getting transaction pass");
		userrepo.getTransactionPassword(10000);
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
	

	@Test
	void GetAllTransaction() {
	
		System.out.println("running test : transrepo : "+transrepo);

		List< Transaction > trans; 

		
		trans = transrepo.getAllRecords(100000000);
	
	 Iterator <Transaction> ts = trans.iterator(); 
		while(ts.hasNext())
		{
			System.out.println(ts.next());
				
		}
			
	}
	
	@Test
	void SaveTransaction() {
		

		System.out.println("running test : TransRepo : "+ transrepo );
		Transaction t1 =  new Transaction();
		t1.setAccount(accountRepo.getAccountDetails(100000000));
		t1.setBeneficiaryAcctNo(BigDecimal.valueOf(100032002));
		t1.setBeneficiaryName("Vishal D");
		t1.setDbOrCr("db");
		t1.setTransactionAmount(BigDecimal.valueOf(10000.0));
		t1.setTransactionDate(new Date());
		t1.setTransactionType("NEFT");
		transrepo.save(t1);
		
	}

	

	@Test
	void GetbetweenTransaction() {
	
		System.out.println("running test : transrepo : "+transrepo);
		List<Transaction> trans; 

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
<<<<<<< HEAD
		trans = transrepo.getTransactionBetweenDates(date1, date2, "100000000");

=======
		trans = transrepo.getTransactionBetweenDates(date1, date2, 100000000);
>>>>>>> ritik
		for (Transaction ts : trans) {
			System.out.println(" Transaction id"+ts.getTransactionId());
			
			System.out.println(" Beneficiary Account No."+ts.getBeneficiaryAcctNo());
			
		}
			
	}
	@Test
	void testTransactionid() {
		
		
		
     Transaction t =new Transaction();

		
		 t=transrepo.getTransactionById(90001);
	System.out.println(t.getTransactionType()+" Transaction type");
	 
	
	}
	
<<<<<<< HEAD

}
=======
}
>>>>>>> ritik
