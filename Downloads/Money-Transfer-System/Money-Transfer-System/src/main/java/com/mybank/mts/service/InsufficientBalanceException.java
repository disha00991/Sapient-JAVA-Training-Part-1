package com.mybank.mts.service;

public class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException(String message) {
		System.out.println(message);
	}
}
