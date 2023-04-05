package lambadExpression;

@FunctionalInterface
interface Student {
	void study(String name, String subject);

}

public class Solution {
	public static void main(String[] args) {
		Student s = (name, subject) -> {
			System.out.println(name + "  is studying  " + subject);
		};
		s.study("vishwa", "Mathametics");
		s.study("Ashwin", "java");
	}
}
//there is two type of function
//1.Marker interface   2.functional interface
//Marker Interface means withought adding any methodes to the body of the interface
//ex.