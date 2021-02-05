package com.lti.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo.pojo.Admin;
import com.lti.demo.service.AdminService;

@CrossOrigin
@RestController
public class AdminController {

	@Autowired
	 AdminService adminService;
	
	
	@RequestMapping(path="/loginAdmin")
	@ResponseBody
	public boolean adminLogin( Admin login) {
		return adminService.getPasswordById(login.getUserId() ,login.getPass() );
					
}

	
}