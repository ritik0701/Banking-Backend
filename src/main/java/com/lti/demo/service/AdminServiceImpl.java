package com.lti.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.lti.demo.pojo.Admin;
import com.lti.demo.repository.AdminRepository;



@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository repo;


	public Admin  adminLogin(long userId , String pass) {
	
		return null;
	}
	
	public boolean getPasswordById(long userId , String pass ) {
		
		
		if(repo.getPasswordById(userId).equals(pass))
			return true;
		
		else
			
			return false;
	}
}
