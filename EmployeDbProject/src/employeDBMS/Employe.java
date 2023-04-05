package employeDBMS;

public class Employe {
private	String id;
private	int age;
private	String name;
private	double sal;
	static int count = 100;

	public Employe(int age, String name, double sal) {
		this.id = "emp" + count;
		this.age = age;
		this.name = name;
		this.sal = sal;

		count++;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", age=" + age + ", name=" + name + ", sal=" + sal + "]";
	}
	

}
