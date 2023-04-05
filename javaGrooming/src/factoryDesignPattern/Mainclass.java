package factoryDesignPattern;

import java.util.Scanner;

//Factory design pattern is a methode returning different type of objects by having genralized return type

class Beverage {

}

class coffee extends Beverage {

}

class Tea extends Beverage {

}

class Company {
	Beverage selectDrink(int choice) {
		if (choice == 1) {
			coffee c = new coffee();
			return c;
		} else if (choice == 2) {
			Tea t = new Tea();
			return t;
		} else {
			return null;
		}
	}
}

public class Mainclass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter choice");
		int choice=sc.nextInt();
		
		
		Company h1=new Company();
		
		Beverage obj=h1.selectDrink(choice);
		
		if (obj instanceof coffee) {
			System.out.println("Drinking coffee");
		}else if (obj instanceof Tea) {
			System.out.println("Drinking Tea");
		}else {
			System.out.println("enter valid choice");
		}
	}

}
