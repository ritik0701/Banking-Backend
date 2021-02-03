package com.lti.demo.pojo;
import java.io.Serializable;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TRANSACTIONS database table.
 * 
 */
@Entity
@Table(name="TRANSACTIONS")
@NamedQuery(name="Transaction.findAll", query="SELECT t FROM Transaction t")
public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRANSACTIONS_TRANSACTIONID_GENERATOR", sequenceName="TRANSACTION_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRANSACTIONS_TRANSACTIONID_GENERATOR")
	@Column(name="TRANSACTION_ID")
	private long transactionId;

	@Column(name="BENEFICIARY_ACCT_NO")
	private BigDecimal beneficiaryAcctNo;

	@Column(name="BENEFICIARY_NAME")
	private String beneficiaryName;

	@Column(name="DB_OR_CR")
	private String dbOrCr;

	@Column(name="TRANSACTION_AMOUNT")
	private BigDecimal transactionAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="TRANSACTION_DATE")
	private Date transactionDate;

	@Column(name="TRANSACTION_TYPE_ID")
	private BigDecimal transactionTypeId;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;

	public Transaction() {
	}

	public long getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public BigDecimal getBeneficiaryAcctNo() {
		return this.beneficiaryAcctNo;
	}

	public void setBeneficiaryAcctNo(BigDecimal beneficiaryAcctNo) {
		this.beneficiaryAcctNo = beneficiaryAcctNo;
	}

	public String getBeneficiaryName() {
		return this.beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getDbOrCr() {
		return this.dbOrCr;
	}

	public void setDbOrCr(String dbOrCr) {
		this.dbOrCr = dbOrCr;
	}

	public BigDecimal getTransactionAmount() {
		return this.transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Date getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public BigDecimal getTransactionTypeId() {
		return this.transactionTypeId;
	}

	public void setTransactionTypeId(BigDecimal transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}