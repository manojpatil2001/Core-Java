package com.student.operation;

public class Student {
	
	String name;
	int rollno;
	double marks;
	
	public Student(String name, int rollno,double marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
	
	void display() {
		System.out.println("Name= "+name);
		System.out.println("Roll no= "+rollno);
		System.out.println("Marks= "+marks);
	}
	
	
}
