
package com.lti.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.demo.pojo.Beneficiary;
import com.lti.demo.repository.BeneficiaryRepository;



@Service
public class BeneficiaryServiceImpl implements BeneficiaryService{

	
	@Autowired 
	BeneficiaryRepository repo;
	
	
	@Override
	public List<Beneficiary> getBeneficiaryNameAndAccNo(long userId){
		return repo.getBeneficiaryList(userId);
		
	}
		
		@Override
		public void addBeneficiary(Beneficiary benf) {
			repo.save(benf);
		}
	}