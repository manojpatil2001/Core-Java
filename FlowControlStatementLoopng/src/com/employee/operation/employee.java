package com.employee.operation;

public class employee {

	int id;
	String name;
	double salary;
	
	public employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void display() {
		System.out.println("emp id= "+id);
		System.out.println("emp name= "+name);
		System.out.println("emp salary= "+salary);
	}
	
	
}
