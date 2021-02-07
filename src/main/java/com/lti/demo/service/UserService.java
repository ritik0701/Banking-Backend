package com.lti.demo.service;


	import com.lti.demo.pojo.User;

	public interface UserService {
		
		Boolean loginUser(Long userId, String password);
		Boolean resetPassword(Long userId, String updatedPassword);
		User getUserId(Long accNumber);
		Boolean resetTransactionPassword(Long userId, Integer updatedPassword);
	}