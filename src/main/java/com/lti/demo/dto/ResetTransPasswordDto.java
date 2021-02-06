package com.lti.demo.dto;

import com.lti.demo.pojo.User;

public class ResetTransPasswordDto {
	private long userId;
	private int newTranPass;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public int getNewTranPass() {
		return newTranPass;
	}
	public void setNewTranPass(int newTranPass) {
		this.newTranPass = newTranPass;
	}
	/*
	public ResetTransPasswordDto convertResetTransPasswordDto(User user)
	{
		this.setUserId(user.getUserId());
		this.setNewTranPass(user.getTransaction_Password());
		return this;
		
	}
	*/
}
