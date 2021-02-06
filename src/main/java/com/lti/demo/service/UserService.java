package com.lti.demo.service;


	import com.lti.demo.pojo.User;

	public interface UserService {
		
		
		User loginUser(Long userId, String password);
		String resetPassword(Long userId, String updatedPassword);
		User getUserId(Long accNumber);
		int resetTransactionPassword(Long userId, Integer updatedPassword);
	}

	//String registerUser(UserDataDTO user);
	//int getInvalidAttempts(String UserId);
