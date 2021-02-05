package com.lti.demo.repository;

//import java.math.BigDecimal;
import java.util.List;

import com.lti.demo.pojo.User;

public interface UserRepository {
	void save(User user);
	User findUserById(long userId);
	List<User> getAllUsers();
	User getUserByAccNumber(long accNumber);
	long getTransactionPassword(long fromAccNumber);
	boolean validUserIdPassword(long userId, String password);
	boolean isUserValid(long userId);
	void resetPassword(long userId,String updatedPassword);
	void resetTransactionPassword(long userId,int updatedPassword);
	boolean isUserPresent();

	//void resetPassword(String userId,String updatedPassword);
	//void resetTransactionPassword(String userId,int updatedPassword);
	//boolean isUserPresent();
	
	
}




















//boolean isUserPresent();
//String getUserId();
//boolean isAccountRegistered(String accNumber);