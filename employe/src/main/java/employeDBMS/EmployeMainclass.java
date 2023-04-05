package employeDBMS;

import java.util.Scanner;

import customException.InvalidChoiceException;

public class EmployeMainclass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		EmployeManagementSystem ems = new EmployeManagementSystemImpl();

		while (true) {

			System.out.println(
					"1.Add Employe TO Database\n2.Display Employes From Database\n3.Delete Employe From Database\n4.Update Employe Data\n5.Count Number of Employe");
			System.out.println("6.Exit");
			System.out.println("enter choice:");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				ems.addEmployeTODatabase();
				break;
			case 2:
				ems.displayEmployeFromDatabase();
				break;
			case 3:
				ems.deleteEmployeFromDatabase();
				break;
			case 4:
				ems.updateEmployeFromDatabase();
				break;
			case 5:
				ems.countEmploye();
				break;
				
			case 6:
				System.out.println("thank you!!");
				System.exit(0);
			default:
				try {
					String message = "invalid choice ,enter valid choice";
					throw new InvalidChoiceException(message);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

}
