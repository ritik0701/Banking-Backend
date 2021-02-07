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
	boolean resetPassword(Long userId,String updatedPassword);
	boolean resetTransactionPassword(Long userId,Integer updatedPassword);
	boolean isUserPresent();

	
}