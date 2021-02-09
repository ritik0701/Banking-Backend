package com.lti.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo.dto.AccountNumberDTO;
import com.lti.demo.pojo.Admin;
import com.lti.demo.service.AdminService;

@CrossOrigin
@RestController
public class AdminController {

	@Autowired
	 AdminService adminService;
	
	
	@RequestMapping(path="/loginAdmin")
	public boolean adminLogin(@RequestBody Admin login) throws Exception {
		try {
			if( adminService.getPasswordById(login.getUserId() ,login.getPass() )== true) {
				return true;
			}else {
				throw new Exception();
			}
		}catch(Exception e) {
			throw e;
		}
		
					
}

	@RequestMapping(path="/approveaccount")
	public void approveAccount(@RequestBody AccountNumberDTO dto) {
		adminService.approveAccountService(dto.getAccNo());
					
}
	
	
}