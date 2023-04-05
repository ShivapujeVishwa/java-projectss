package innerclass;

@FunctionalInterface
interface Amazon {
	void purchase(String name);
}

class Customer implements Amazon {
	public void purchase(String name) {
		System.out.println("purchasing " + name);
	}
}

public class runnerClass {
	public static void main(String[] args) {
		// regular way
		Customer c = new Customer();
		c.purchase("mobile");

		System.out.println("--------------------");

		// executed by using anonymous inner class
		Amazon a = new Amazon() {

			@Override
			public void purchase(String name) {
				System.out.println("purchasing " + name);

			}
		};
		a.purchase("laptop");
		System.out.println("-----------------------------");
//executed by using anonymous inner class
		new Amazon() {

			@Override
			public void purchase(String name) {
				System.out.println("purchasing " + name);

			}
		}.purchase("ear buds");

		System.out.println("----------------------------");
//executed by using lambdaExpression
		Amazon a1 = (name) -> {
			System.out.println("purchasing " + name);
		};
		a1.purchase("LED tv");
		System.out.println("----------------------------------");
		
		Amazon a2=(name)-> System.out.println("purchasing "+name);
		a2.purchase("bag");
	}

}
