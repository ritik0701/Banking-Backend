package com.lti.demo.service;

import java.util.List;

import com.lti.demo.pojo.Beneficiary;


public interface BeneficiaryService {

	List<Beneficiary> getBeneficiaryNameAndAccNo(long userId);

void addBeneficiary(Beneficiary benf);

}
