package com.lti.demo.repository;

import com.lti.demo.pojo.Admin;

public interface AdminRepository {
	
	
	Admin getAdminById(long userId);
	String getAdminByIdAndPassword(long userId, String password);
	boolean isAdminAvailable(long userId);
}
