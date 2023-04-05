package com;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class DepartMentalStore {
	// key-> product id->Integer & value ->Product Instance -> product

	LinkedHashMap<Integer, Product> db = new LinkedHashMap<>();
	Scanner sc = new Scanner(System.in);
	int totalbill = 0;

	void addProduct() {
		db.put(1, new Product("chocalates", 10, 5));
		db.put(2, new Product("Biscuits", 20, 10));
		db.put(3, new Product("IceCream", 30, 20));
	}
	

	void displayProduct() {
		Set<Integer> keys = db.keySet();
		for (Integer key : keys) {
			Product p = db.get(key);
			System.out.println("Enter " + key + " to order " + p.getName());
			System.out.println("Available Quantity: " + p.getQuantity());
			System.out.println("Product Cost: rs." + p.getCost());
			System.out.println("--------------------------------");
		}

	}

	void buyProduct() {

		System.out.println("enter choice");
		int choice = sc.nextInt();// 1 2 3

		// getting the product based on choice &returns null when key is not present
		Product p = db.get(choice);

		if (p != null) {
			System.out.println("enter quantity:");
			int quantity = sc.nextInt();
			if (quantity <= p.getQuantity()) {

				// calculate current product cost
				int productcost = (int) (quantity * p.getCost());

				// add current product cost to total bill
				totalbill = totalbill + productcost;// totalbill=+productcost;

				/// update the new quantity
				p.setQuantity(p.getQuantity() - quantity);

				System.out.println("Ordered " + quantity + " " + p.getName());
				System.out.println("product Cost: " + productcost);
				System.out.println("Total as of now: " + totalbill);

			} else {
				System.out.println("invalid quantity:");// InvalidQuantityException
			}

		} else {
			System.out.println("invalid choice");// InvalidChoiceException7
		}

	}

	void checkout() {
		System.out.println("TOtal Bill: rs." + totalbill);
		System.out.println("thank you for shopping");
	}

}
