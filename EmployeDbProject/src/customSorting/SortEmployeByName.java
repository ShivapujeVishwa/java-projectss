package customSorting;

import java.util.Comparator;

import employeDBMS.Employe;

public class SortEmployeByName implements Comparator<Employe> {

	@Override
	public int compare(Employe e1, Employe e2) {
		String x=e1.getName();//auto boxing
		String y=e2.getName();
		return x.compareTo(y);
		// or return e1.getName().compareTo(e2.getName());
	}

}
//e1->object to be inserted  e2->already existing object