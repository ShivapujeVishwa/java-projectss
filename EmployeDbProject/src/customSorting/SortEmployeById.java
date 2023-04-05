package customSorting;

import java.util.Comparator;

import employeDBMS.Employe;

public class SortEmployeById implements Comparator<Employe>{

	@Override
	public int compare(Employe e1, Employe e2) {
		String x=e1.getId();
		String y=e2.getId();
		return x.compareTo(y);
		// or return e1.getName().compareTo(e2.getName());
	}

}
//e1->object to be inserted  e2->already existing object
