package com;



public class Employee {
	String id;
	String name;
	
	static int count=101;
	
	public Employee(String name) {
		this.id="jsp" +count;
		this.name=name;
		
		count++;
		
		
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee("vishwa");
		Employee e2=new Employee("ashwin");
		
		System.out.println("id:"+e1.id+" "+"Name:"+e1.name);
		System.out.println("id:"+e2.id+" "+"Name:"+e2.name);
	}

}
