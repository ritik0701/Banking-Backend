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
		public Boolean loginUser(Long userId, String password)
		{
			if((repo.isUserValid(userId))==false)
			{
				return false;
			}
			else if((repo.validUserIdPassword(userId, password))==false)
			{
				return false;
			}
			else
			{
			return true;
			}
			
		}
		
		
		
		@Override
		public Boolean resetPassword(Long userId, String updatedPassword) {
			// TODO Auto-generated method stub
			
			if((repo.isUserValid(userId))==false)
			{	
				return false;
			}
			else if((repo.resetPassword(userId,updatedPassword))==false)
			{
			return false;
			}
			else
			{
				return true;
			}
		}
		
		@Override
		public Boolean resetTransactionPassword(Long userId, Integer updatedPassword) {
	// TODO Auto-generated method stub
		
			if((repo.isUserValid(userId)==false))
			{
				return false;
			}
			else if((repo.resetTransactionPassword(userId,updatedPassword))==false)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		@Override
		public User getUserId(Long accNumber) {
			// TODO Auto-generated method stub
			try {
				return repo.getUserByAccNumber(accNumber);
			
			}
			catch(EmptyResultDataAccessException e) {
				throw new ServiceException("Please Register First");
			}
		}
}