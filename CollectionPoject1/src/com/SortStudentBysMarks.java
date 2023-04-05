package com;

import java.util.Comparator;

public class SortStudentBysMarks implements Comparator<Student> {

	@Override
	public int compare(Student s1,Student s2) {
	return s1.marks.compareTo(s2.marks);
	}
}
