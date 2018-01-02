package com.mybank.mts.repository;

import java.util.List;

import com.mybank.mts.model.Customer;

public interface AccountRepository {
	void save(Customer customer);
	Customer find(String acNo);
	void update(Customer customer);
	List<Customer> findAll();
	public void clean();
}
