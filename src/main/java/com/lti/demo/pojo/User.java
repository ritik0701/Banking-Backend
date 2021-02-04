package com.lti.demo.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="user_id",length=50)
	private int User_Id; 
	@Column(name="pass",nullable=false)
	private String Pass;
	@Column(name="acc_no",nullable=false)
	private int Acc_No;
	@Column(name="profile_pass",nullable=false)
	private String Profile_Pass;
	public int getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public int getAcc_No() {
		return Acc_No;
	}
	public void setAcc_No(int acc_No) {
		Acc_No = acc_No;
	}
	public String getProfile_Pass() {
		return Profile_Pass;
	}
	public void setProfile_Pass(String profile_Pass) {
		Profile_Pass = profile_Pass;
	}
	

}
