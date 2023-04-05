package sdbms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.Student;

import customException.InvalidChoicException;
import customException.StudentNotFoundException;
import customsorting.SortStudentByAge;
import customsorting.SortStudentById;
import customsorting.SortStudentByMarks;
import customsorting.SortStudentByName;

public class StudentManagementSystemImpl implements StudentManagementSystem {

	Scanner scanner = new Scanner(System.in);

	Map<String, Student> map = new LinkedHashMap<>();

	@Override
	public void addStudent() {
		System.out.println("Enter student age:");
		int age = scanner.nextInt();
		System.out.println("enter student name:");
		String name = scanner.next();
		System.out.println("Enter student marks:");
		int marks = scanner.nextInt();

		Student sd = new Student(age, name, marks);
		map.put(sd.getId(), sd);
		System.out.println();

	}

	@Override
	public void displayStudent() {
		System.out.println("enter student id:");
		String id = scanner.next();
		id = id.toUpperCase();
		if (map.containsKey(id)) {
			Student std = map.get(id);
			System.out.println("ID:" + std.getId());
			System.out.println("age:" + std.getAge());
			System.out.println("name:" + std.getName());
			System.out.println("marks:" + std.getMarks());

		} else {
			try {
				String message = "Student with the id: " + id + " is not found";
				throw new StudentNotFoundException(message);
			} catch (StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void displayAllStudent() {

		if (map.size() != 0) {
			System.out.println("student records are as follows");
			Set<String> keys = map.keySet();// JSP101 JSP102
			for (String key : keys) {
				Student std = map.get(key);
				System.out.println(std);// System.out.println(map.get(key));
			}
		} else {
			try {
				String message = "Student database is empty,nothing to display";
				throw new StudentNotFoundException(message);
			} catch (StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void removeStudent() {

		System.out.println("enter student id:");
		String id = scanner.next().toUpperCase();

		if (map.containsKey(id)) {
			System.out.println("Student record successfully");
			System.out.println(map.get(id));
			map.remove(id);
			System.out.println("Student record deleted successfully");
		} else {
			try {
				String message = "Student with the id " + id + "  not found";
				throw new StudentNotFoundException(message);
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

	}

	@Override
	public void removeAllStudent() {
		if (map.size() != 0) {
			System.out.println("available Student records:" + map.size());
			map.clear();
			System.out.println("all student record deleted successfully");
		} else {
			try {
				String message = "Student database is empty,nothing to delete";
				throw new StudentNotFoundException(message);
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

	}

	@Override
	public void updateStudent() {
		System.out.println("enter id");
		String id = scanner.next();
		id = id.toUpperCase();

		if (map.containsKey(id)) {
			Student std = map.get(id);
			System.out.println("1.update marks\n2.update Age\n\n3.name");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter marks:");
				int marks = scanner.nextInt();
				std.setMarks(marks);
				break;

			case 2:
				System.out.println("enter name");
				int age = scanner.nextInt();
				std.setAge(age);
				System.out.println("age updated successfully");
				break;
			case 3:
				System.out.println("enter name");
				String name = scanner.next();
				std.setName(name);
				System.out.println("name updated successfully");
				break;

			default:
				try {
					String messgae = "invaluid choice,enter valid choice";
					throw new InvalidChoicException(messgae);
				} catch (InvalidChoicException e) {
					System.out.println(e.getMessage());
				}
			}

		} else {
			try {
				String message = "student id is not found";
				throw new StudentNotFoundException(message);
			} catch (StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void countStudent() {
		System.out.println("available student records:" + map.size());

	}

	@Override
	public void sortStudent() {
		if (map.size() >= 2) {

			Set<String> keys = map.keySet();
			List<Student> list = new ArrayList<>();
			for (String key : keys) {
				list.add(map.get(key));// adding Student object into list
			}
			System.out.println(
					"1.SortStudentById\n2.Sort Student By Age\n3.Sortyt Student By Name\n4.Sort Student By Marks");
			System.out.println("enter choice:");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				Collections.sort(list, new SortStudentById());
				display(list);
				break;
			case 2:
				Collections.sort(list, new SortStudentByAge());
				display(list);
				break;
			case 3:
				Collections.sort(list, new SortStudentByName());
				display(list);

				break;
			case 4:
				Collections.sort(list, new SortStudentByMarks());
				display(list);
			default:
				try {
					String message = "invalid choice,enter valid choice ";
					throw new InvalidChoicException(message);

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} else {
			try {
				String message = "No sufficient records to sort";
				throw new InvalidChoicException(message);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}

	private static void display(List<Student> list) {
		for (Student s : list) {
			System.out.println(s);
		}

	}

	@Override
	public void getStudentWithHighestMarks() {
		if (map.size() >= 2) {

			Set<String> keys = map.keySet();
			List<Student> list = new ArrayList<>();
			for (String key : keys) {
				list.add(map.get(key));// adding Student object into list
			}
			Collections.sort(list, new SortStudentByMarks());
			System.out.println(list.get(map.size() - 1));
		} else {
			try {
				String messageString = "No sufficient records  to compare";
				throw new StudentNotFoundException(messageString);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void getStudentWithLowestMarks() {
		if (map.size() >= 2) {

			Set<String> keys = map.keySet();
			List<Student> list = new ArrayList<>();
			for (String key : keys) {
				list.add(map.get(key));// adding Student object into list
			}
			Collections.sort(list, new SortStudentByMarks());
			System.out.println(list.get(0));
		} else {
			try {
				String messageString = "No sufficient records  to compare";
				throw new StudentNotFoundException(messageString);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
