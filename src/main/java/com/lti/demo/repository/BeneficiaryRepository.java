package com.lti.demo.repository;
import java.util.List;


import com.lti.demo.pojo.Beneficiary;

public interface BeneficiaryRepository {
	
	void save(Beneficiary benf);
	List<Beneficiary> getBeneficiaryList(long userId) ;
	Beneficiary getBeneficiary(long beneficiaryId);
	
}