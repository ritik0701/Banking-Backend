package com.lti.demo.service;

import com.lti.demo.pojo.Admin;

public interface AdminService {
	
	
	Admin adminLogin(long userId , String pass);

	boolean getPasswordById(long userId , String pass);
	
}