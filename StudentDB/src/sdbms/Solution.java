package sdbms;

import java.util.Scanner;

import customException.InvalidChoicException;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Welcome To Student Database Class");

		Scanner sc = new Scanner(System.in);

		StudentManagementSystem smsi = new StudentManagementSystemImpl();// upcasting

		while (true) {

			System.out.println(
					"1.add Student\n2.display Student\n3.display All Student\n4.remove Student\n5.remove All Student\n6.update Student\n7.sort Student\n8.count Student\n9.get Student With Highest Marks\n10.get Student With Lowest Marks");
			System.out.println("11.exit/enter choice:");

			System.out.println("Enter choice:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				smsi.addStudent();
				
				break;
			case 2:
				smsi.displayStudent();
				break;
			case 3:
				smsi.displayAllStudent();
				break;
			case 4:
				smsi.removeStudent();
				break;
			case 5:
				smsi.removeAllStudent();
				break;
			case 6:
				smsi.updateStudent();
				break;
			case 8:
				smsi.countStudent();
				break;
			case 7:
				smsi.sortStudent();
				break;
			case 9:
				smsi.getStudentWithHighestMarks();
				break;
			case 10:
				smsi.getStudentWithLowestMarks();
				break;
			case 11:
				System.out.println("thank you!!!");
				System.exit(0);
				break;
			default:
				try {
				String message="invalid choice,Enter valid choice";
				throw  new InvalidChoicException(message);
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			System.out.println("-------------------------");
		}

	}

}
