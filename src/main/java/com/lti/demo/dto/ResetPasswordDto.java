package com.lti.demo.dto;

import com.lti.demo.pojo.User;

public class ResetPasswordDto {
private long userId;
private String newPass;
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
}
public String getNewpass() {
	return newPass;
}
public void setNewPass(String newPass) {
	this.newPass = newPass;
}
/*
public ResetPasswordDto convertResetPasswordDto(User user)
{
	this.setUserId(user.getUserId());
	this.setNewPass(user.getPass());
	return this;

	}
	*/
}
