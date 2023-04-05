package com.icici;


public class InsufficientBalanceException extends RuntimeException {
	private String message;
	
	InsufficientBalanceException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		return "enter a valid amount to withdraw";
	}
	

}
