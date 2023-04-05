package factoryDesignPattern;

import java.util.Scanner;

class Food {

}

class Biriyani extends Food {

}

class Curdrice extends Food {

}

class Friedrice extends Food {

}

class Hotel {

	Food orderFood(int choice) {
		if (choice == 1) {
			Biriyani b = new Biriyani();
			return b;
		} else if (choice == 2) {
			Friedrice f = new Friedrice();
			return f;
		} else if (choice == 3) {
			Curdrice c = new Curdrice();
			return c;
		} else {
			return null;
		}

	}

}

public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter choice:");
		int choice = sc.nextInt();
		Hotel h = new Hotel();

		/*
		 * food obj=h.orderFood(1); --> Food obj=new Biriyani(); food
		 * obj=h.orderFood(2); --> Food obj=new Friedrice(); food obj=h.orderFood(3);
		 * --> Food obj=new Curdrice(); food obj=h.orderFood(4); --> Food obj=null;
		 */

		Food obj = h.orderFood(choice);

		if (obj instanceof Biriyani) {
			System.out.println("Eating Biriyani");
		} else if (obj instanceof Curdrice) {
			System.out.println("Eating Curdrice");
		} else if (obj instanceof Friedrice) {
			System.out.println("Eating Friedrice");
		} else {
			System.out.println("invalid choice");
		}
		

	}

}
