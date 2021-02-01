package com.lti.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ACCOUNT database table.
 * 
 */
@Entity
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
@NamedQuery(name="getBalance",query="select u.balance from Account u where u.ACC_NO=:accNumber")
@NamedQuery(name="getAccountStatus",query="select u.ACCOUNT_STATUS from Account u where u.ACC_NO=:accNumber")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ACCOUNT_ACCNO_GENERATOR", sequenceName="ACC_NO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACCOUNT_ACCNO_GENERATOR")
	@Column(name="ACC_NO")
	private long accNo;

	@Column(name="ACCOUNT_STATUS")
	private BigDecimal accountStatus;

	private String address;

	@Column(name="ADMIN_REMARK")
	private String adminRemark;

	@Column(name="ANNUAL_INCOME")
	private BigDecimal annualIncome;

	private BigDecimal balance;

	private String city;

	@Temporal(TemporalType.DATE)
	private Date dob;

	private String email;

	private String father;

	private String firstname;

	private String landmark;

	private String lastname;

	private String middlename;

	private String occupation;

	private String phone;

	private BigDecimal pincode;

	@Column(name="PROOF_ID")
	private String proofId;

	@Column(name="PROOF_TYPE_ID")
	private BigDecimal proofTypeId;

	@Column(name="\"STATE\"")
	private String state;

	//bi-directional many-to-one association to Beneficiary
	@OneToMany(mappedBy="account")
	private List<Beneficiary> beneficiaries;

	//bi-directional one-to-one association to User
	@OneToOne
	@JoinColumn(name="ACC_NO", referencedColumnName="ACC_NO")
	private User user;

	public Account() {
	}

	public long getAccNo() {
		return this.accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public BigDecimal getAccountStatus() {
		return this.accountStatus;
	}

	public void setAccountStatus(BigDecimal accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdminRemark() {
		return this.adminRemark;
	}

	public void setAdminRemark(String adminRemark) {
		this.adminRemark = adminRemark;
	}

	public BigDecimal getAnnualIncome() {
		return this.annualIncome;
	}

	public void setAnnualIncome(BigDecimal annualIncome) {
		this.annualIncome = annualIncome;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFather() {
		return this.father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLandmark() {
		return this.landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public BigDecimal getPincode() {
		return this.pincode;
	}

	public void setPincode(BigDecimal pincode) {
		this.pincode = pincode;
	}

	public String getProofId() {
		return this.proofId;
	}

	public void setProofId(String proofId) {
		this.proofId = proofId;
	}

	public BigDecimal getProofTypeId() {
		return this.proofTypeId;
	}

	public void setProofTypeId(BigDecimal proofTypeId) {
		this.proofTypeId = proofTypeId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Beneficiary> getBeneficiaries() {
		return this.beneficiaries;
	}

	public void setBeneficiaries(List<Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

	public Beneficiary addBeneficiary(Beneficiary beneficiary) {
		getBeneficiaries().add(beneficiary);
		beneficiary.setAccount(this);

		return beneficiary;
	}

	public Beneficiary removeBeneficiary(Beneficiary beneficiary) {
		getBeneficiaries().remove(beneficiary);
		beneficiary.setAccount(null);

		return beneficiary;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}