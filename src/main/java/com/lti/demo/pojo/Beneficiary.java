package com.lti.demo.pojo;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the BENEFICIARY database table.
 * 
 */
@Entity
@NamedQuery(name="Beneficiary.findAll", query="SELECT b FROM Beneficiary b")
public class Beneficiary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="beneficiary_Id")
	private long beneficiaryId;
	
	@Column(name="beneficiary_ACC_NO")
	private long beneficiaryAccNo;

	@Column(name="BANK_IFSC")
	private String bankIfsc;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_ADDED")
	private Date dateAdded;

	@Column(name="beneficiary_name")
	private String beneficiaryName;

	//bi-directional many-to-one association to Account
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public String getBankIfsc() {
		return this.bankIfsc;
	}

	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public long getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(long beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public long getBeneficiaryAccNo() {
		return beneficiaryAccNo;
	}

	public void setBeneficiaryAccNo(long beneficiaryAccNo) {
		this.beneficiaryAccNo = beneficiaryAccNo;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}