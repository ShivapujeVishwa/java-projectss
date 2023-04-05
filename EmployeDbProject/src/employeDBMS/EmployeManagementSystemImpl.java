package employeDBMS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import customException.EmployeNotFoundException;

import customException.InvalidChoiceException;

import customSorting.SortEmployeByAge;
import customSorting.SortEmployeById;
import customSorting.SortEmployeByName;
import customSorting.SortEmpoyeBySalary;

public class EmployeManagementSystemImpl implements EmployeManagementSystem {

	Scanner sc = new Scanner(System.in);

	Map<String, Employe> map = new LinkedHashMap<>();

	@Override
	public void addEmploye() {
		System.out.println("enter age:");
		int age = sc.nextInt();
		System.out.println("enter name:");
		String name = sc.next();
		System.out.println("enter salary:");
		double sal = sc.nextDouble();
		System.out.println("enter ");

		Employe em = new Employe(age, name, sal);
		map.put(em.getId(), em);

	}

	@Override
	public void sortEmploye() {
		if (map.size() >= 2) {

			Set<String> keys = map.keySet();
			List<Employe> list = new ArrayList<>();
			for (String key : keys) {
				list.add(map.get(key));// adding Student object into list
			}
			System.out.println(
					"1.SortStudentById\n2.Sort Student By Age\n3.Sortyt Student By Name\n4.Sort Student By Marks");
			System.out.println("enter choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Collections.sort(list, new SortEmployeById());
				display(list);
				break;
			case 2:
				Collections.sort(list, new SortEmployeByAge());
				display(list);
				break;
			case 3:
				Collections.sort(list, new SortEmployeByName());
				display(list);

				break;
			case 4:
				Collections.sort(list, new SortEmpoyeBySalary());
				display(list);
			default:
				try {
					String message = "invalid choice,enter valid choice ";
					throw new InvalidChoiceException(message);

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} else {
			try {
				String message = "No sufficient records to sort";
				throw new InvalidChoiceException(message);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}

	private static void display(List<Employe> list) {
		for (Employe e : list) {
			System.out.println(e);
		}

	}

	@Override
	public void displayEmploye() {
		System.out.println("enter student id:");
		String id = sc.next();
		id = id.toUpperCase();
		if (map.containsKey(id)) {
			Employe emp = map.get(id);
			System.out.println("ID:" + emp.getId());
			System.out.println("age:" + emp.getAge());
			System.out.println("name:" + emp.getName());
			System.out.println("marks:" + emp.getSal());

		} else {
			try {
				String message = "Student with the id: " + id + " is not found";
				throw new EmployeNotFoundException(message);
			} catch (EmployeNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void displayAllEmploye() {
		if (map.size() != 0) {
			System.out.println("student records are as follows");
			Set<String> keys = map.keySet();// JSP101 JSP102
			for (String key : keys) {
				Employe emp = map.get(key);
				System.out.println(emp);// System.out.println(map.get(key));
			}
		} else {
			try {
				String message = "Student database is empty,nothing to display";
				throw new EmployeNotFoundException(message);
			} catch (EmployeNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void removeAllEmploye() {
		if (map.size() != 0) {
			System.out.println("available Student records:" + map.size());
			map.clear();
			System.out.println("all student record deleted successfully");
		} else {
			try {
				String message = "Student database is empty,nothing to delete";
				throw new EmployeNotFoundException(message);
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

	}

	@Override
	public void removeEmploye() {
		System.out.println("enter student id:");
		String id = sc.next().toUpperCase();

		if (map.containsKey(id)) {
			System.out.println("Employee record successfully");
			System.out.println(map.get(id));
			map.remove(id);
			System.out.println("Employee record deleted successfully");
		} else {
			try {
				String message = "Student with the id " + id + "  not found";
				throw new EmployeNotFoundException(message);
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

	}

	@Override
	public void updateEMploye() {
		System.out.println("enter id");
		String id = sc.next();
		id = id.toUpperCase();

		if (map.containsKey(id)) {
			Employe std = map.get(id);
			System.out.println("1.update sal\n2.update Age\n\n3.name");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter sal");
				double sal = sc.nextDouble();
				std.setSal(sal);
				break;

			case 2:
				System.out.println("enter age");
				int age = sc.nextInt();
				std.setAge(age);
				System.out.println("age updated successfully");
				break;
			case 3:
				System.out.println("enter name");
				String name = sc.next();
				std.setName(name);
				System.out.println("name updated successfully");
				break;

			default:
				try {
					String messgae = "invaluid choice,enter valid choice";
					throw new InvalidChoiceException(messgae);
				} catch (InvalidChoiceException e) {
					System.out.println(e.getMessage());
				}
			}

		} else {
			try {
				String message = "employe id is not found";
				throw new EmployeNotFoundException(message);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void getEmployeByHighestSal() {
		if (map.size() >= 2) {

			Set<String> keys = map.keySet();
			List<Employe> list = new ArrayList<>();
			for (String key : keys) {
				list.add(map.get(key));// adding Student object into list
			}
			Collections.sort(list, new SortEmpoyeBySalary());
			System.out.println(list.get(map.size() - 1));
		} else {
			try {
				String messageString = "No sufficient records  to compare";
				throw new EmployeNotFoundException(messageString);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void getEmployeByLowestSal() {
		if (map.size() >= 2) {

			Set<String> keys = map.keySet();
			List<Employe> list = new ArrayList<>();
			for (String key : keys) {
				list.add(map.get(key));// adding Student object into list
			}
			Collections.sort(list, new SortEmpoyeBySalary());
			System.out.println(list.get(0));
		} else {
			try {
				String message = "No sufficient records  to compare";
				throw new EmployeNotFoundException(message);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void countEmploye() {
		System.out.println("count number of employe:" + map.size());

	}

}
