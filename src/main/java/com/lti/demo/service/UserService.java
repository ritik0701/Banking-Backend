package com.lti.demo.service;


	import com.lti.demo.dto.AccountNumberDTO;
import com.lti.demo.pojo.User;

	public interface UserService {
		
		Boolean loginUser(Long userId, String password) throws Exception;
		Boolean resetPassword(Long userId, String updatedPassword);
		User getUserId(Long accNumber);
		Boolean resetTransactionPassword(Long userId, Integer updatedPassword);
		void saveUserService(long accNo);
		AccountNumberDTO getAccountNumber(long userId);
	}