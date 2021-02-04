package com.lti.demo.repository;

import com.lti.demo.pojo.Admin;

public interface AdminRepository {
	
	
	Admin getAdminById(long userId);
	String getPasswordById(long userId);
	boolean isAdminAvailable(long userId);
<<<<<<< HEAD
}
=======
}
>>>>>>> 9ba854cf10755f54109d0b5213695e6e994292dd
