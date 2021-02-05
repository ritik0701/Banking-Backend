package com.lti.demo.service;



import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import com.lti.demo.pojo.Account;
import com.lti.demo.pojo.User;
import com.lti.demo.repository.UserRepository;

import com.lti.demo.exception.ServiceException;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repo;
	
	
		@Override
		public User loginUser(long userId, String password) {
			Boolean var1=repo.isUserValid(userId);
			if(var1=Boolean.FALSE)
			{	
				
				throw new ServiceException("User Doesn't Exist");
			}
			else {
				Boolean var2=repo.validUserIdPassword(userId, password);
				if(var2=Boolean.FALSE) {
					
					throw new ServiceException("Invalid Credentials");
				}
				User user = repo.findUserById(userId);
				return user;
			}
		}
		
		
		
		@Override
		public String resetPassword(long userId, String updatedPassword) {
			// TODO Auto-generated method stub
			Boolean var=repo.isUserValid(userId);
			if(var=Boolean.FALSE)
			{	
				throw new ServiceException("User Doesn't Exist");
			}
			
			repo.resetPassword(userId,updatedPassword);
			return updatedPassword;
		}
		
		@Override
		public int resetTransactionPassword(long userId, int updatedPassword) {
			// TODO Auto-generated method stub
			Boolean var=repo.isUserValid(userId);
			if(var=Boolean.FALSE)
			{
				throw new ServiceException("User Doesn't Exist");
			}
			repo.resetTransactionPassword(userId,updatedPassword);
			return updatedPassword;
		}
		@Override
		public User getUserId(long accNumber) {
			// TODO Auto-generated method stub
			try {
				return repo.getUserByAccNumber(accNumber);
			
			}
			catch(EmptyResultDataAccessException e) {
				throw new ServiceException("Please Register First");
			}
		}
}

/*
 * public int getInvalidAttempts(String userId) {
			System.out.println("Parth");
			return repo.getNoOfInvalidAttempts(userId);
		}
		
		*/
