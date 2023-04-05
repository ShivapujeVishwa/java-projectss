package customsorting;

import java.util.Comparator;

import com.Student;

public class SortStudentById implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getId().compareTo(s2.getId());

	}

}
