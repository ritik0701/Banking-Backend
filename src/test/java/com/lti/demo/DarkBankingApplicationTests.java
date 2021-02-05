package com.lti.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DarkBankingApplicationTests {


	//Ritik-------------------------------------------------------------------------------
	
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
		beneficiary.setBeneficiaryId(11111);
		beneficiary.setBankIfsc("HDFC3498");
		beneficiary.setBeneficiaryAccNo(432589890);
		beneficiary.setBeneficiaryName("Aadaish");
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
		for (Transaction ts : trans) {
			System.out.println(" Transaction id"+ts.getTransactionId());
			
			System.out.println(" Beneficiary Account No."+ts.getBeneficiaryAcctNo());
			
		}
			
	}
	

}
