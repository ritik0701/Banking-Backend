package com.lti.demo.repository;
import java.util.List;
import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.lti.demo.pojo.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@PersistenceContext
	private EntityManager em;
	
	//insert user data
	@Override
	@Transactional
	public void save(User user) {
		// TODO Auto-generated method stub
	
		em.persist(user);
	}
	
	//validation of user
	@Override
	@Transactional
	public boolean validUserIdPassword(Long userId, String password) {
		/// TODO Auto-generated method stub
		String queryString="select count(*) from Users u where u.user_id=:id and u.pass=:password";
		if(((BigDecimal)em.createNativeQuery(queryString).setParameter("id", userId).setParameter("password", password).getSingleResult()).equals(BigDecimal.valueOf(1)))
			
			return true;
		else 
			return false;
	}
	//uservalidation
	@Override
	@Transactional
	public boolean isUserValid(Long userId) {
		String queryString="select count(u.user_id) from Users u where u.user_id=:id";
		if(((BigDecimal)em.createNativeQuery(queryString).setParameter("id",userId).getSingleResult()).equals(BigDecimal.valueOf(1)))
			return true;
		else 
			return false;
	}
//get users by id
	@Override
	@Transactional
	public User findUserById(Long userId) {	
		return em.find(User.class,userId);
	}
	/*
	//get user by accno
	@Override
	@Transactional
	public long getUserByAccNumber(long accNumber) {
		String queryString ="select u.user_id from Users u where u.acc_no=:accNumber";
		return (long)em.createNativeQuery(queryString,User.class).setParameter("accNumber", accNumber).getSingleResult();
	}
	*/
	//get user by accno
		@Override
		@Transactional
		public User getUserByAccNumber(Long accNumber) {
			String queryString ="select * from Users u where u.acc_no=:accNumber";
			return (User)em.createNativeQuery(queryString,User.class).setParameter("accNumber", accNumber).getSingleResult();
		}
	
	//get trans pass  by userId
	@Override
	@Transactional

	public long getTransactionPassword(Long fromAccNumber) {
		// TODO Auto-generated method stub
				System.out.println(fromAccNumber);
				String queryString ="select u.transaction_Password from Users u where u.acc_no=:accNumber";
				return (long)em.createNativeQuery(queryString)
						.setParameter("accNumber",fromAccNumber).getSingleResult();
	}

	@Override
	@Transactional
	public boolean resetPassword(Long userId, String updatedPassword) {
		String queryString ="update Users set pass=:password where user_id=:id";
		em.createNativeQuery(queryString)
		.setParameter("id",userId)
		.setParameter("password",updatedPassword)
		.executeUpdate();
		return true;
	}
	@Override
	@Transactional

	public boolean resetTransactionPassword(Long userId, Integer updatedPassword) {

		System.out.println(userId);
		System.out.println(updatedPassword);
		String queryString="update Users set transaction_Password=:password where user_id=:id";
		em.createNativeQuery(queryString)
		.setParameter("id",userId)
		.setParameter("password",updatedPassword)
		.executeUpdate();
		return true;
	}
	@Override
	@Transactional
	public boolean isUserPresent() {
		String queryString="select count(*) from Users";
		if(((BigDecimal)em.createNativeQuery(queryString).getSingleResult()).equals(BigDecimal.valueOf(1))) 
			return true;
		else
			return false;
	}
	
	@Override
	@Transactional
	public List<User> getAllUsers()
	{
		String queryString = "Select * from users";
		
	    List<User> userlist = em.createNativeQuery(queryString,User.class).getResultList();
	    return userlist;	
		
	}
	
	
}