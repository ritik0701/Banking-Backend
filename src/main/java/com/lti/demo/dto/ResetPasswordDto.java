package com.lti.demo.dto;

import com.lti.demo.pojo.User;

public class ResetPasswordDto{
private Long userId;
private String oldPassword;
private String updatedPassword;
private String confirmPassword;

public String getOldPassword() {
	return oldPassword;
}
public void setOldPassword(String oldPassword) {
	this.oldPassword = oldPassword;
}
public String getConfirmPassword() {
	return confirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public String getUpdatedPassword() {
	return updatedPassword;
}
public void setUpdatedPassword(String updatedPassword) {
	this.updatedPassword = updatedPassword;
}


}
