package com.lti.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import com.lti.demo.pojo.Admin;

@Repository
public class AdminRepositoryImpl implements AdminRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Admin getAdminById(long userId) {
		
		return entityManager.find(Admin.class, userId);
	}

	@Override
	public boolean isAdminAvailable(long userId) {
		return (Long) entityManager.createNativeQuery("select count(a.USER_ID) from Admin a where a.USER_ID = :user")
				.setParameter("user", userId).getSingleResult() == 1 ? true : false;
	}

	@Override
	public String getAdminByIdAndPassword(long userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}	
