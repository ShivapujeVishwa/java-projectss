package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Welcome toArchan mam general Store");
		System.out.println("-----------------------------------");

		Scanner sc = new Scanner(System.in);
		DepartMentalStore ds = new DepartMentalStore();

		ds.addProduct();
		int choice = 1;
		while (choice == 1) {
			ds.displayProduct();
			ds.buyProduct();
			System.out.println("=------------");
			System.out.println("press 1 to contiune shopping");
			System.out.println("or any othernuumber to checkout");
			choice = sc.nextInt();
		}
		ds.checkout();
	}

}
