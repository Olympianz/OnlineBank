package com.cogent.banking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {

	private String address;
	private String bankName;
	private Integer bank_ID;
	
	@Column(name="address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name="bank_name", nullable=false, length=50)
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bank_id")
	public Integer getBank_ID() {
		return bank_ID;
	}
	public void setBank_ID(Integer bank_ID) {
		this.bank_ID = bank_ID;
	}
	
}
