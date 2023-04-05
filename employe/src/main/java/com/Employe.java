package com;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employe {
	private String name;
	private int age;
	private double sal;
	@Id
	private String id;

	static int count = 100;

	public Employe(String name, int age, double sal) {
		
		this.id = "emp" + count;
		this.name = name;
		this.age = age;
		this.sal = sal;
		
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employe [name=" + name + ", age=" + age + ", sal=" + sal + ", id=" + id + "]";
	}
	
	

}
