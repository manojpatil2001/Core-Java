package com.jbk.MethodOverloading;

public class Test {
	
	void m1() {
		System.out.println("0 arg m1 method");
		
	}
	void m1(int x) {
		System.out.println("int arg m1 method");
		
	}
	void m1(String x) {
		System.out.println("String arg m1 method");
		
	}
	void m1(int x, double y) {
		System.out.println("int - double arg m1 method");
		
	}
	void m1(double x , int y) {
		System.out.println("double - int arg m1 method");
		
	}
	

}
