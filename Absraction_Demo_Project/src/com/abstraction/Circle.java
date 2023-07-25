package com.abstraction;

public class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing a Circle");

	}

	@Override
	void calculateArea() {
		int radius = 10;
		double area = 3.14 * radius * radius;
		System.out.println(area);

	}

}
