package lambadExpression;

interface Employe {
	void work();
}

public class Mainclass {
	public static void main(String[] args) {
		//this methode is called lambdaexpression
		Employe employe = () -> {
			System.out.println("in which company you are working");
		};
		employe.work();
	}
}


