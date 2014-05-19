package com.cogent.banking.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	private Calendar creation_date;
	private Integer acct_ID;
	private String type;
	private Double balance;
	
	@Column(name="creation_time")
	public Calendar getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(Calendar creation_date) {
		this.creation_date = creation_date;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="acct_id")
	public Integer getAcct_ID() {
		return acct_ID;
	}
	public void setAcct_ID(Integer acct_ID) {
		this.acct_ID = acct_ID;
	}
	
	@Column(name="acct_type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Column(name="balance")
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
}
