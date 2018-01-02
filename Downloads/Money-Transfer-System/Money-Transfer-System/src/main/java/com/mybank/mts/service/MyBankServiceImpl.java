package com.mybank.mts.service;

import javax.security.auth.login.AccountNotFoundException;

import com.mybank.mts.model.Customer;
import com.mybank.mts.repository.AccountRepository;
import com.mybank.mts.repository.CustomerAlreadyExistsException;
import com.mybank.mts.repository.CustomerNotFoundException;
import com.mybank.mts.repository.JdbcAccountRepository;

public class MyBankServiceImpl implements MyBankService {

	AccountRepository repository = new JdbcAccountRepository();

	public void createNewAccount(Customer customer) {
		if (repository.find(customer.getAcNo()) == null) {// account does not exist
			repository.save(customer);
		} else {// account already exists
			throw new CustomerAlreadyExistsException("This account already exists!");
		}
	}

	public void withdraw(Customer customer, int amount) {

		if (repository.find(customer.getAcNo()) == null) {// account does not exist
			throw new CustomerNotFoundException("This account was not found!");
		} else {
			if (customer.getBalance() >= amount) {
				int balance = customer.getBalance() - amount;
				customer.setBalance(balance);
			} else {// transaction unsuccessful
				throw new InsufficientBalanceException("Balance is insufficient for transaction");
			}
		}

		// transaction successful
		repository.update(customer);
	}

	public void deposit(Customer customer, int amount) {
		if (repository.find(customer.getAcNo()) == null) {// account does not exist
			throw new CustomerNotFoundException("This account was not found!");
		} else {
			int balance = customer.getBalance() + amount;
			customer.setBalance(balance);
		}
		repository.update(customer);
	}

	public void transfer(Customer depositor, Customer receiver, int amount) {

		this.withdraw(depositor, amount);
		this.deposit(receiver, amount);

		// transaction successful
	}

}
