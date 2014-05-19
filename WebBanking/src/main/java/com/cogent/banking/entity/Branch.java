package com.cogent.banking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branch extends Bank {

	private String branch_name;
	private Integer branch_ID;
	
	@Column(name="branch_name")
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="branch_id")
	public Integer getBranch_ID() {
		return branch_ID;
	}
	public void setBranch_ID(Integer branch_ID) {
		this.branch_ID = branch_ID;
	}
	
	
}
