package com.mybank.mts.repository;

public class CustomerAlreadyExistsException extends RuntimeException {
	public CustomerAlreadyExistsException(String message) {
		System.out.println(message);
	}
}
