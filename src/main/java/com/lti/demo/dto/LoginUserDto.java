package com.lti.demo.dto;

import com.lti.demo.pojo.User;

public class LoginUserDto
{
private long userId;
private String pass;
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
/*
public LoginUserDto convertLoginUserDto(User user)
{
	this.setUserId(user.getUserId());
	this.setPass(user.getPass());
	return this;
	}
	*/
}
