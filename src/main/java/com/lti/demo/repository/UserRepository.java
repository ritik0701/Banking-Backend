package com.lti.demo.repository;

//import java.math.BigDecimal;
import java.util.List;

import com.lti.demo.pojo.User;

public interface UserRepository {
	void save(User user);
	User findUserById(Long userId);
	List<User> getAllUsers();
	User getUserByAccNumber(Long accNumber);
	long getTransactionPassword(Long fromAccNumber);
	boolean validUserIdPassword(Long userId, String password);
	boolean isUserValid(Long userId);
	void resetPassword(Long userId,String updatedPassword);
	void resetTransactionPassword(Long userId,Integer updatedPassword);
	boolean isUserPresent();

	//void resetPassword(String userId,String updatedPassword);
	//void resetTransactionPassword(String userId,int updatedPassword);
	//boolean isUserPresent();
	
	
}




















//boolean isUserPresent();
//String getUserId();
//boolean isAccountRegistered(String accNumber);