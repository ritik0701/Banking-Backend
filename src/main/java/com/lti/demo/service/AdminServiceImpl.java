package com.lti.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.lti.demo.mail.EmailService;
import com.lti.demo.pojo.Account;
import com.lti.demo.pojo.Admin;
import com.lti.demo.pojo.User;
import com.lti.demo.repository.AccountRepository;
import com.lti.demo.repository.AdminRepository;
import com.lti.demo.repository.UserRepository;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository repo;
	@Autowired
	private AccountRepository accountRepo;
	@Autowired
	private EmailService emailService;
	@Autowired
	private UserRepository userRepo;

	public Admin  adminLogin(long userId , String pass) {
	
		return null;
	}
	
	public boolean getPasswordById(long userId , String password ) {
		
		
		if(repo.getPasswordById(userId).equals(password))
			return true;
		
		else
			
			return false;
	}

	@Override
	public void approveAccountService(long accNo) {
		try {
			repo.approveAccount(accNo);
			Account account = accountRepo.getAccountDetails(accNo);
			System.out.print("Print1: "+account.getAccountStatus());
			accountRepo.updateAccount(account);
			System.out.print("Print2: "+account.getAccountStatus());
			User user = new User();
			user.setAccount(account);
			user.setPass("Xyzzzzzz");
			user.setTransaction_Password(1234);
			userRepo.save(user);
			Long userId = userRepo.getUserByAccNumber(accNo).getUserId();
			String message = "Your Account number : "+accNo+" and User Id is : "+ userId.longValue()+" and password is : Xyzzzzzz"+" and Transaction password is : 1234";
			emailService.sendSimpleMessage(account.getEmail(),"Congratulations Your account is now open!!!" ,message);
			}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
