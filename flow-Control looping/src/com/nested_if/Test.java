package com.nested_if;

public class Test {

//Nested if : if the result is condition is true than execute if block body.
	//else: and the result is condition is false than execute else block body.
	
	
	
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		if (a < b) {

			if (a < b) {

				if (a < b) {
					System.out.println("hello");
				}

			}
		}
	}
}
