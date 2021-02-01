package com.lti.pojo;

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
	@Column(name="ACC_NO")
	private long accNo;

	@Column(name="BANK_IFSC")
	private String bankIfsc;

	@Column(name="BANK_NAME")
	private String bankName;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_ADDED")
	private Date dateAdded;

	private String name;

	//bi-directional many-to-one association to Account
	@ManyToOne
	@JoinColumn(name="USER_ACC_NO")
	private Account account;

	public Beneficiary() {
	}

	public long getAccNo() {
		return this.accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getBankIfsc() {
		return this.bankIfsc;
	}

	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}