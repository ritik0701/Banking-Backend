package com.lti.demo.repository;

import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
	public boolean validUserIdPassword(long userId, String password) {
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
	public boolean isUserValid(long userId) {
		String queryString="select count(u.user_id) from Users u where u.user_id=:id";
		if(((BigDecimal)em.createNativeQuery(queryString).setParameter("id",userId).getSingleResult()).equals(BigDecimal.valueOf(0)))
			return true;
		else 
			return false;
	}
//get users by id
	@Override
	@Transactional
	public User findUserById(long userId) {	
		return em.find(User.class,userId);
	}
	
	//get user by accno
	@Override
	@Transactional
	public User getUserByAccountNumber(long accNumber) {
		String queryString ="select * from Users u where u.acc_no=:accNumber";
		return (User) em.createNativeQuery(queryString,User.class).setParameter("accNumber", accNumber).getSingleResult();
	}
	
	//get trans pass  by userId
	@Override
	@Transactional
	public BigDecimal getTransactionPassword(long userId) {
		// TODO Auto-generated method stub
				String queryString ="select u.transaction_Password from Users u where u.user_id=:userId";
				return (BigDecimal)em.createNativeQuery(queryString)
						.setParameter("userId",userId).getSingleResult();
	}

	
	
	
}