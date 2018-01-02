package com.mybank.mts.repository;

public class CustomerNotFoundException extends RuntimeException{
	public CustomerNotFoundException(String message) {
		System.out.println(message);
	}
}
