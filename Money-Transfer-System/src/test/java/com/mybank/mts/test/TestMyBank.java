package com.mybank.mts.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.mybank.mts.model.Customer;
import com.mybank.mts.repository.AccountRepository;
import com.mybank.mts.repository.JdbcAccountRepository;
import com.mybank.mts.service.MyBankService;
import com.mybank.mts.service.MyBankServiceImpl;

public class TestMyBank {
	AccountRepository repository = null;
	MyBankService service = null;

	@Before
	public void setUp() {
		System.out.println("Before");
		repository = new JdbcAccountRepository();
		service = new MyBankServiceImpl();
	}

	@Test
	public void testCreateNewAccount() {
		System.out.println("testCreateNewAccount");
		Customer customer = new Customer("Disha", "123458", 5000);
		
		service.createNewAccount(customer);
		
		// Assert
		Customer cust = repository.find(customer.getAcNo());
		System.out.println(cust.getName());
		System.out.println(cust.getAcNo());
		System.out.println(cust.getBalance());
		assertNotNull(cust);
	}

	@Test
	public void testSuccessOfWithdrawal() {
		System.out.println("testSuccessOfWithdrawal");
		
		Customer customer = new Customer("Ridhi", "123451", 5000);
		repository.save(customer);

		service.withdraw(customer, 250);
		int balance = repository.find(customer.getAcNo()).getBalance();
		System.out.println(balance);
		
		// Assert
		assertEquals(4750, balance, 0);
	}

	@Test
	public void testSuccessOfDeposit() {
		System.out.println("testSuccessOfDeposit");

		Customer customer = new Customer("sneha", "121158", 5000);
		repository.save(customer);
		
		service.deposit(customer, 250);
		int balance = repository.find(customer.getAcNo()).getBalance();
		System.out.println(balance);

		// Assert
		assertEquals(5250, balance, 0);
	}

	@Test
	public void testSuccessOfTransfer() {
		System.out.println("testSuccessOfTransfer");

		Customer depositor = new Customer("mom", "124300", 5000);
		Customer receiver = new Customer("Nehal", "234123", 1000);

		repository.save(depositor);
		repository.save(receiver);
		
		service.transfer(depositor, receiver, 1000);
		service.transfer(receiver, depositor, 500);

		int finalBalance = repository.find(depositor.getAcNo()).getBalance();
		System.out.println(finalBalance);

		// Assert
		assertEquals(4500, finalBalance, 0);
	}

}
