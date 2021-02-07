package com.lti.demo.pojo;
import java.io.Serializable;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private Long userId;
    private String pass;
    //bi-directional many-to-one association to Transaction

 

    //bi-directional one-to-one association to Account
    @JsonIgnore
    @OneToOne(mappedBy="user")
    private Account account;
    
    @Column(name="transaction_Password",nullable=false)
    private Integer transactionPassword;
    @JsonIgnore
    //bi-directional many-to-one association to Beneficiary
    @OneToMany(mappedBy="user")
    private List<Beneficiary> beneficiaries;
    
    public Long getUserId() {
        return this.userId;
    }

 

    public void setUserId(Long userId) {
        this.userId = userId;
    }

 

    public String getPass() {
        return this.pass;
    }

 

    public void setPass(String pass) {
        this.pass = pass;
    }

 

    public Account getAccount() {
        return this.account;
    }

 

    public void setAccount(Account account) {
        this.account = account;
    }

 

    public Integer getTransaction_Password() {
        return transactionPassword;
    }

 

    public void setTransaction_Password(Integer transaction_Password) {
        this.transactionPassword = transaction_Password;
    }
    
    public List<Beneficiary> getBeneficiaries() {
        return this.beneficiaries;
    }

 

    public void setBeneficiaries(List<Beneficiary> beneficiaries) {
        this.beneficiaries = beneficiaries;
    }
    
    public Beneficiary addBeneficiary(Beneficiary beneficiary) {
        getBeneficiaries().add(beneficiary);
        beneficiary.setUser(this);

 

        return beneficiary;
    }

 

    public Beneficiary removeBeneficiary(Beneficiary beneficiary) {
        getBeneficiaries().remove(beneficiary);
        beneficiary.setUser(null);

        return beneficiary;
    }

 

}