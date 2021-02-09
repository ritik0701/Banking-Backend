package com.lti.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.lti.demo.pojo.Beneficiary;

@Repository
public class BeneficiaryRepositoryImpl implements BeneficiaryRepository {
	
	@PersistenceContext
	 EntityManager entityManager;
	


	@Override
	@Transactional
	public void save(Beneficiary beneficiary) {
		entityManager.persist(beneficiary);
	}



	@SuppressWarnings("unchecked")
	@Override
	public List<Beneficiary> getBeneficiaryList(long userId) {

		Query query =  entityManager.createNativeQuery("select * from Beneficiary b where b.user_id =:userId",Beneficiary.class);
		return (List<Beneficiary>)query.setParameter("userId",userId ).getResultList();
		
	}
	
	@Override
	public Beneficiary getBeneficiary(long beneficiaryId) {
		return entityManager.find(Beneficiary.class, beneficiaryId);
	}
	

}

