package com.jbk.ConstructorOverloading;

public class Calculate_area {

	void area(int radius) {
		double area = 3.14 * radius * radius;
		System.out.println("Area Of Circle = " + area);
	}

	void area(int length, int side) {
		int area = length * side;
		System.out.println("Area Of Rectangle = " + area);
	}
}
