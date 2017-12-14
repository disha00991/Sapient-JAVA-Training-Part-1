package com.mybank.mts.repository;

public class AccountNotFoundException extends RuntimeException {
	public AccountNotFoundException(String message) {
		System.out.println(message);
	}
}
