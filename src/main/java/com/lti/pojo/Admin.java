package com.lti.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ADMIN" database table.
 * 
 */
@Entity
@Table(name="ADMIN")
@NamedQuery(name="Admin.findAll", query="SELECT a FROM Admin a")
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USERID_GENERATOR", sequenceName="USER_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERID_GENERATOR")
	@Column(name="USER_ID")
	private long userId;

	private String pass;

	public Admin() {
	}

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
