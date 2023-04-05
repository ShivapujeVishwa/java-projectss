package customSorting;

import java.util.Comparator;

import employeDBMS.Employe;

public class SortEmpoyeBySalary implements Comparator<Employe> {

	@Override
	public int compare(Employe e1, Employe e2) {
		Integer x=e1.getAge();
		Integer y=e2.getAge();
		return x.compareTo(y);
		// or return e1.getAge()-e2.getAge();
	}

}
//e1->object to be inserted  e2->already existing object
