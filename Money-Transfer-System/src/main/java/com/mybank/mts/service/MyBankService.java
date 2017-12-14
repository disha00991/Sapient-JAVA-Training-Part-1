package com.mybank.mts.service;

import com.mybank.mts.model.Customer;

public interface MyBankService {
	public void createNewAccount(Customer customer);
	public void withdraw(Customer customer, int amount);
	public void deposit(Customer customer, int amount);
	public void transfer(Customer depositor, Customer receiver, int amount);
}
