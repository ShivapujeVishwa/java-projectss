package lambadExpression;
@FunctionalInterface
interface Person{
	String display(int age);
}
public class Test {
	public static void main(String[] args) {
		Person p=(age) ->{
			return "age is:"+age;
		
			
		};
		
	System.out.println(	p.display(20));
	}

}
