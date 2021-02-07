package com.lti.demo.repository;

import com.lti.demo.pojo.Admin;

public interface AdminRepository {
	
	
	public Admin getAdminById(long userId);
	public String getPasswordById(long userId);
	public boolean isAdminAvailable(long userId);
	public void approveAccount(long accNo);
	
}