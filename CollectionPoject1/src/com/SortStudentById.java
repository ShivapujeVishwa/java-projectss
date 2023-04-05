package com;

import java.util.Comparator;

public class SortStudentById implements Comparator<Student> {
	@Override
	public int compare(Student s1,Student s2) {
	return s1.id.compareTo(s2.id);//ascending order
	}

}
