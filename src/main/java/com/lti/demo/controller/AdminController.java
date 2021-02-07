package com.lti.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo.dto.LoginAdminDto;
import com.lti.demo.dto.StatusDto;
import com.lti.demo.pojo.Admin;
import com.lti.demo.service.AdminService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdminController {

	@Autowired
	 AdminService adminService;
	
	
	@RequestMapping(path="/loginAdmin")
	@ResponseBody
	public StatusDto adminLogin(@RequestBody LoginAdminDto loginadmin) {
		StatusDto status=new StatusDto();
		
		try {
			if(adminService.getPasswordById(loginadmin.getUserId(),loginadmin.getPass())==true)
			{
				status.setStatus("Login Successful!!");
			}
			}
		catch(Exception e){
			status.setStatus("Invalid credentials!!");
		}
		return status;
					
}

	
}