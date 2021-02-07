package com.lti.demo.dto;

import com.lti.demo.pojo.User;

public class ResetTransPasswordDto {
	private Long userId;
	private Integer updatedPassword;
	private Integer oldPassword;
	private Integer confirmPassword;
	public Long getUserId() {
		return userId;
	}
	public Integer getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(Integer oldPassword) {
		this.oldPassword = oldPassword;
	}
	public Integer getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(Integer confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getUpdatedPassword() {
		return updatedPassword;
	}
	public void setUpdatedPassword(Integer updatedPassword) {
		this.updatedPassword = updatedPassword;
	}
	
}