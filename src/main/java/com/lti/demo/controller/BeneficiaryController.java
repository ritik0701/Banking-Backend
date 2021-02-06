package com.lti.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo.dto.AddBeneficiaryDTO;
import com.lti.demo.dto.FindBeneficiaryDTO;
import com.lti.demo.pojo.Beneficiary;

import com.lti.demo.service.BeneficiaryService;

@CrossOrigin
@RestController
public class BeneficiaryController {

	@Autowired
	 BeneficiaryService beneficiaryService;
	
	
	@RequestMapping(path="/findBeneficiary")
	@ResponseBody
	 List find(@RequestBody FindBeneficiaryDTO f) {
		
		List<Beneficiary> list = beneficiaryService.getBeneficiaryNameAndAccNo(f.getUserId());
		return list ;
}
	
	@RequestMapping(path="/addBeneficiary")
	@ResponseBody
	 void add (@RequestBody AddBeneficiaryDTO b) {
		
		beneficiaryService.addBeneficiary(b);
		
	}
}
