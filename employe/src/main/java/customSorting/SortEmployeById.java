package customSorting;

import java.util.Comparator;

import com.Employe;

public class SortEmployeById implements Comparator<Employe> {

	public int compare(Employe e1, Employe e2) {
		return e1.getId().compareTo(e2.getId());
	}

}
