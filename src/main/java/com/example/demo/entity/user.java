package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class user {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public Integer getAccount_No() {
		return Account_No;
	}
	public void setAccount_No(Integer account_No) {
		Account_No = account_No;
	}
	public Integer getBalance() {
		return Balance;
	}
	public void setBalance(Integer balance) {
		Balance = balance;
	}
	private String customer;
	private Integer Account_No;
	private Integer Balance;
	
	
	
	
}

	
	