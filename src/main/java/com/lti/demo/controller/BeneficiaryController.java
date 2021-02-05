package com.lti.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.lti.demo.pojo.Beneficiary;

import com.lti.demo.service.BeneficiaryService;

@CrossOrigin
@RestController
public class BeneficiaryController {

	@Autowired
	 BeneficiaryService beneficiaryService;
	
	
	@RequestMapping(path="/findBeneficiary")
	@ResponseBody
	 List find(long f) {
		
		List<Beneficiary> list = beneficiaryService.getBeneficiaryNameAndAccNo(f);
		return list ;
}
	
	@RequestMapping(path="/addBeneficiary")
	@ResponseBody
	 void add (@RequestBody Beneficiary b) {
		
		beneficiaryService.addBeneficiary(b);
		
	}
}
