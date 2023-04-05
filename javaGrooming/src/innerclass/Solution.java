package innerclass;

import innerclass.*;
import innerclass.*;

abstract class person {
		abstract void eat();
	}

	class Tom extends person {
		void eat() {
			System.out.println(" Tom is eating");
		}
	}

	public class Solution {
		public static void main(String[] args) {
			//by having explicit subclass
			Tom tom=new  Tom();
			tom.eat();
			
			System.out.println("---------------------------------");
			
			//Anonymous Inner class
			person person=new person() {
				
				@Override
				void eat() {
					System.out.println("tom is eating");
					
				}
			};
			person.eat();
		}

	}



