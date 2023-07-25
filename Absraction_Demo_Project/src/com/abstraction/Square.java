package com.abstraction;

public class Square extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing a Square");

	}

	@Override
	void calculateArea() {
		int Side = 10;
		double area = Side * Side;
		System.out.println(area);

	}

}
