package com.abstraction;

public class Main {
	
	public static void main(String[] args) {
		
		Shape circle = new Circle();
		circle.draw();
		circle.calculateArea();
		
		Shape square = new Square();
		circle.draw();
		square.calculateArea();
	
		
	}

}
