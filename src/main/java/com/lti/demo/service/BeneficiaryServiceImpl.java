
package com.lti.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.demo.dto.AddBeneficiaryDTO;
import com.lti.demo.pojo.Beneficiary;
import com.lti.demo.repository.BeneficiaryRepository;
import com.lti.demo.repository.UserRepositoryImpl;



@Service
public class BeneficiaryServiceImpl implements BeneficiaryService{

	
	@Autowired 
	BeneficiaryRepository repo;
	@Autowired
	UserRepositoryImpl u ;
	
	@Override
	public List<Beneficiary> getBeneficiaryNameAndAccNo(long userId){
		return repo.getBeneficiaryList(userId);
		
	}
		
		@Override
		public void addBeneficiary(AddBeneficiaryDTO benf) {
			
		
			Beneficiary b = new Beneficiary();
			b.setBankIfsc(benf.getBankIfsc());
			b.setBeneficiaryAccNo(benf.getBeneficiaryAccNo());
			b.setBeneficiaryName(benf.getBeneficiaryName());
			b.setDateAdded(benf.getDateAdded());
			b.setUser(u.findUserById(benf.getUserId()));
			
			repo.save(b);
			
		}
		@Override
		public  Beneficiary getBeneficiary(long beneficiaryId) {
			return repo.getBeneficiary(beneficiaryId);
			
		}
	}