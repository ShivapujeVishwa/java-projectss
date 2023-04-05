package innerclass;

interface Calculator{
	void add(int a,int b);
	int mul(int a,int b);
}

public class Mainclass {
	public static void main(String[] args) {
		//anonymous innerclass
		Calculator calculator=new Calculator() {
			
			@Override
			public int mul(int a, int b) {
				
				return a*b;
			
				
			}
			
			@Override
			public void add(int a, int b) {
				System.out.println("sum of two number is:"+a+b);
				
			}
		};
		
		calculator.add(10, 40);
		System.out.println("product of two number is:"+calculator.mul(40, 10));
	}

}
