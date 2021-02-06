package com.lti.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo.dto.AdminLoginDTO;
import com.lti.demo.pojo.Admin;
import com.lti.demo.service.AdminService;

@CrossOrigin
@RestController
public class AdminController {

	@Autowired
	 AdminService adminService;
	
	
	@RequestMapping(path="/loginAdmin")
	@ResponseBody
	public boolean adminLogin(@RequestBody AdminLoginDTO adminlogindto) {
		return adminService.getPasswordById(adminlogindto.getUserId(), adminlogindto.getPass());
					
}
	
}