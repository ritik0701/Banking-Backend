package com.lti.demo.pojo;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the USERS database table.
 * 
 */
@Entity
@Table(name="USERS")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USERS_USERID_GENERATOR", sequenceName="USER_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERS_USERID_GENERATOR")
	@Column(name="USER_ID")
	private long userId;

	private String pass;

	//bi-directional many-to-one association to Transaction
	@OneToMany(mappedBy="user")
	private List<Transaction> transactions;

	//bi-directional one-to-one association to Account
	@OneToOne(mappedBy="user")
	private Account account;
	
	@Column(name="transaction_Password",nullable=false)
	private int transactionPassword;
	
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

	public List<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Transaction addTransaction(Transaction transaction) {
		getTransactions().add(transaction);
		transaction.setUser(this);

		return transaction;
	}

	public Transaction removeTransaction(Transaction transaction) {
		getTransactions().remove(transaction);
		transaction.setUser(null);

		return transaction;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getTransaction_Password() {
		return transactionPassword;
	}

	public void setTransaction_Password(int transaction_Password) {
		this.transactionPassword = transaction_Password;
	}

}