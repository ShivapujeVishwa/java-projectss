package com;

public class Student {
	Integer id;
	String name;
	Integer marks;

	public Student(Integer id, String name, Integer marks) {
		this.name = name;
		this.marks = marks;
		this.id = id;
	}

	@Override
	public String toString() {
		return "ID:" + id + "\tName:" + name + "\tmarks:" + marks;
	}

}
