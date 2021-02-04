package com.lti.demo.repository;

import java.math.BigDecimal;
<<<<<<< HEAD

=======
import java.util.List;
>>>>>>> 9ba854cf10755f54109d0b5213695e6e994292dd

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
	
<<<<<<< HEAD
}
=======
}




















//boolean isUserPresent();
//String getUserId();
//boolean isAccountRegistered(String accNumber);
>>>>>>> 9ba854cf10755f54109d0b5213695e6e994292dd
