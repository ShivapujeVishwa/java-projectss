package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calculator cal = new CalculatorImp();
		while (true) {

			System.out.println("enter choice:");
			int choice = sc.nextInt();

			int x = 0;
			int y = 0;

			if (choice >= 1 && choice <= 4) {
				System.out.println("enter x value:");
				x = sc.nextInt();

				System.out.println("enter y value:");
				y = sc.nextInt();
			}

			switch (choice) {

			case 1:
				System.out.println(cal.add(x, y));
				break;
			case 2:
				System.out.println(cal.substract(x, y));
				break;
			case 3:
				System.out.println(cal.multiplication(x, y));
				break;
			case 4:
				int result = cal.division(x, y);
				if (result != -1) {
					System.out.println(cal.division(x, y));
				} else {
					System.out.println("cannot be defined:");
				}
				break;
			case 5:
				System.out.println("thank you");
				System.exit(0);
			default:
				System.out.println(cal.DisplayErrorMessage());

			}
			System.out.println("----------------");
		}
	}
}
