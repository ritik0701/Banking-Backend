package com.lti.demo.dto;

import com.lti.demo.pojo.User;

public class GetUserIdDto {
private long accNumber;

public long getAccNumber() {
	return accNumber;
}

public void setAccNumber(long accNumber) {
	this.accNumber = accNumber;
}


/*
public GetUserIdDto convertGetUserIdDto(User user)
{
	this.setAccNo(user.getAccount().getAccNo());
	return this;
	}
*/
}
