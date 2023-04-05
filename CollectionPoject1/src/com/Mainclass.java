package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Mainclass {
	public static void main(String[] args) {
		Student s1 = new Student(100, "Tom", 300);
		Student s2 = new Student(300, "Jerry", 500);
		Student s3 = new Student(200, "Morries", 600);

		Map<Integer, Student> map = new LinkedHashMap<>();
		map.put(s1.id, s1);
		map.put(s2.id, s2);
		map.put(s3.id, s3);

// converting map into set of keys using keySet()
		Set<Integer> keys = map.keySet();
//creating instance of ArrayList and storing it into list reference		
		List<Student> list = new ArrayList<>();

// Traversing keys from set
		for (Integer id : keys) {

			Student std = map.get(id);// getting value(Student object)
			list.add(std);// Adding value(Student object)into ArrayList
			// printing value(Student object)

		}

		Scanner sc = new Scanner(System.in);

		System.out.println("1:Sort Student by id\n2:Sort Student by name");
		System.out.println("3:Sort Student by Marks\nEnter choice");
		int choice = sc.nextInt();

		SortStudentById sId = new SortStudentById();
		SortStudentByName sName = new SortStudentByName();
		SortStudentBysMarks sMarks = new SortStudentBysMarks();

		switch (choice) {
		case 1:
			Collections.sort(list, sId);
			for (Student s : list) {
				System.out.println(s);
			}
			break;
		case 2:
			Collections.sort(list, sMarks);
			for (Student s : list) {
				System.out.println(s);
			}
			break;
		case 3:
			Collections.sort(list, sName);
			for (Student s : list) {
				System.out.println(s);
			}
			break;
		default:
			System.out.println("invalid choice:");
			break;
		}

	}
}
