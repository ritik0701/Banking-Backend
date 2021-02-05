package com.lti.demo.service;


	import com.lti.demo.pojo.User;

	public interface UserService {
		
		
		User loginUser(long userId, String password);
		String resetPassword(long userId, String updatedPassword);
		User getUserId(long accNumber);
		int resetTransactionPassword(long userId, int updatedPassword);
	}

	//String registerUser(UserDataDTO user);
	//int getInvalidAttempts(String UserId);
