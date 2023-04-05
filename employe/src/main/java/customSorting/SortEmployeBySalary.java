package customSorting;

import java.util.Comparator;

import com.Employe;

public class SortEmployeBySalary implements Comparator<Employe> {

	public int compare(Employe e1, Employe e2) {
		Double x = e1.getSal();
		Double y = e2.getSal();
		return x.compareTo(y);
	}

}
//we cannot minus double value directly so we need to store in another veriable