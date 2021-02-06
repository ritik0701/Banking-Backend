package com.lti.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.demo.pojo.Admin;

@Repository
public class AdminRepositoryImpl implements AdminRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	@Transactional
	public Admin getAdminById(long userId) {
		
		return entityManager.find(Admin.class, userId);
	}

	@Transactional
	public boolean isAdminAvailable(long userId) {
		return (long) entityManager.createNativeQuery("select count(a.user_id) from Admin a where a.user_id = :userid")
				.setParameter("userid", userId).getSingleResult() == 1 ? true : false;
	}

	@Transactional
	public String getPasswordById(long userId) {
		// TODO Auto-generated method stub
		return (String) entityManager.createNativeQuery("select a.pass from Admin a where a.user_id = :userid")
				.setParameter("userid", userId).getSingleResult();
	}


	
}