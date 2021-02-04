package com.lti.demo.repository;

import java.math.BigDecimal;


import com.lti.demo.pojo.User;

public interface UserRepository {
	void save(User user);
	User findUserById(long userId);
	User getUserByAccountNumber(long accNumber);
	BigDecimal getTransactionPassword(long userId);
	boolean validUserIdPassword(long userId, String password);
	boolean isUserValid(long userId);
	//void resetPassword(String userId,String updatedPassword);
	//void resetTransactionPassword(String userId,String updatedPassword);
	
}