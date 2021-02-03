package com.lti.demo.pojo;

import javax.persistence.*;


@Entity
@Table(name="ADMIN")
public class Admin  {
	
	@Id
	@SequenceGenerator(name="USERID_GENERATOR", sequenceName="USER_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERID_GENERATOR")
	@Column(name="USER_ID")
	private long userId;

	private String pass;

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

}
