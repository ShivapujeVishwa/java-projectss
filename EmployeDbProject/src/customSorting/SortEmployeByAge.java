package customSorting;

import java.util.Comparator;

import employeDBMS.Employe;

public class SortEmployeByAge implements Comparator<Employe> {

	@Override
	public int compare(Employe e1, Employe e2) {
		Double x = e1.getSal();
		Double y = e2.getSal();
		return x.compareTo(y);
		// or return e1.getName().compareTo(e2.getName());
	}

}
//e1->object to be inserted  e2->already existing object
