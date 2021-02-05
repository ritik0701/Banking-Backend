package com.lti.demo.repository;

import com.lti.demo.pojo.Admin;

public interface AdminRepository {
	
	
	Admin getAdminById(long userId);
	
	String getPasswordById(long userId);
	
	boolean isAdminAvailable(long userId);

}