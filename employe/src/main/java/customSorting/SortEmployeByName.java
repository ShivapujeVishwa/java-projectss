package customSorting;

import java.util.Comparator;

import com.Employe;

public class SortEmployeByName implements Comparator<Employe> {

	public int compare(Employe e1, Employe e2) {

		return e1.getName().compareTo(e2.getName());
	}

}
