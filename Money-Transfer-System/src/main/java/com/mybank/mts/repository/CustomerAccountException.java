package com.mybank.mts.repository;

public class CustomerAccountException extends RuntimeException {
	public CustomerAccountException(String message) {
		System.out.println(message);
	}
}
