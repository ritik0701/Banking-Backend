package com.lti.demo.dto;

public class LoginAdminDto
{
 private long userId;
 public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
private String pass;
 
}
