package com.icici;

import java.util.Scanner;


public class solution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank bank=new BankImpl(100000);
	while (true) {
		System.out.println("1.deposit amount\n2.withdraw amount\n13.check balance");
		System.out.println("4.invalid choice\n5.exit");
		
		System.out.println("enter choice:");
		int choice=sc.nextInt();
		
		switch (choice) {
		case 1: 
			System.out.println("enter amount we want to deposit:");
			int amountToDeposit=sc.nextInt();
			bank.deposit(amountToDeposit);
			break;
		case 2:
			System.out.println("enter amount we want to withdraw:");
			int amountToWithdraw=sc.nextInt();
			bank.withdraw(amountToWithdraw);
			break;
		case 3:
			System.out.println("available balance:"+bank.getBalance());
			break;
		case 4:
			System.out.println("thank you visit again");
			System.exit(0);
		
		default:
			try {
				throw new InvalidChoiceException("Insufficient Balance");
			}catch (Exception e) {
				e.getMessage();
			}
			
		}
	}
	}
}

