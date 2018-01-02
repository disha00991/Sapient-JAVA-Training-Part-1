package com.mybank.mts.model;

public class Customer {
	private String name;
	private String acNo;
	private int balance;
	
	public Customer(String name, String acNo, int balance) {
		super();
		this.name = name;
		this.acNo = acNo;
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public String getAcNo() {
		return acNo;
	}	
}
