package com.lti.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Admin")
public class Admin 
{@Id
	@Column(length = 20, nullable = false)
	private String UserId;
	@Column(length = 20, nullable = false)
	private String Password;
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}
