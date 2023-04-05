package com.icici;

public class BankImpl implements Bank {

	int balance;

	public BankImpl(int balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Depositing rs:" + amount);
		balance += amount;// balance=balance+amount;
		System.out.println("amount deposited successfully:");
	}

	@Override
	public void withdraw(int amount) throws InsufficientBalanceException {
		if (amount <= balance) {
			System.out.println("withdrawing rs:" + amount);
			balance -= amount;// balance=balance-amount;
			System.out.println("withdraw successfully:");
		} else {
			// create insufficientbalanceException invoke using throw keyword
			try {
				throw new InsufficientBalanceException("Insufficient Balance");
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}

	@Override
	public int getBalance() {
		return balance;
	}

}
