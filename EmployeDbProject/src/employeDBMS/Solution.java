package employeDBMS;

import java.util.Scanner;

import customException.InvalidChoiceException;

public class Solution {
	public static <StudentManagementSystem> void main(String[] args) {
		System.out.println("Welcome To Student Database Class");

		Scanner sc = new Scanner(System.in);

		EmployeManagementSystem smsi = new EmployeManagementSystemImpl();// upcasting

		while (true) {

			System.out.println(
					"1.add Employe\n2.display Employe\n3.display All Employe \n4.remove Employe\n5.remove All Employe\n6.update Employe\n7.sort Employe\n8.count Employe\n9.get Employe With Highest sal\n10.get EMploye With Lowest sal");
			System.out.println("11.exit/enter choice:");

			System.out.println("Enter choice:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				smsi.addEmploye();

				break;
			case 2:
				smsi.displayEmploye();
				break;
			case 3:
				smsi.displayAllEmploye();
				break;
			case 4:
				smsi.removeEmploye();
				break;
			case 5:
				smsi.removeAllEmploye();
				break;
			case 6:
				smsi.updateEMploye();
				break;
			case 8:
				smsi.countEmploye();
				break;
			case 7:
				smsi.sortEmploye();
				break;
			case 9:
				smsi.getEmployeByHighestSal();
				break;
			case 10:
				smsi.getEmployeByLowestSal();
				break;
			case 11:
				System.out.println("thank you!!!");
				System.exit(0);
				break;
			default:
				try {
					String message = "invalid choice,Enter valid choice";
					throw new InvalidChoiceException(message);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			System.out.println("-------------------------");
		}

	}

}
