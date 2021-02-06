package com.lti.demo.dto;



public class AdminLoginDTO {
	
	private long userId;
	public long getUserId() {
		 return this.userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getPass() {
		return this.pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	private String pass;
 
}
