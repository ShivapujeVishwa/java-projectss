package factoryDesignPattern;

class Person {

}

class Employe extends Person {
	int id =100;

	void work() {
		System.out.println("working");
	}
}

class Student extends Person {
	int age=40;

	void study() {
		System.out.println("Studying");

	}
}

public class Mrunner {
	
	//Genralization
	//1.Person obj=new Employe
	//2.Person obj=new Student
	static void display(Person obj) {
		if (obj instanceof Employe) {
			Employe e = (Employe) obj;
			System.out.println(e.id);
			e.work();
		} else if (obj instanceof Student) {
			Student s = (Student) obj;
			System.out.println(s.age);
			s.study();
		}
	}

	public static void main(String[] args) {
		display(new Employe());
		display(new Student());
	}

}
