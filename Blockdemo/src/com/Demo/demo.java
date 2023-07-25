package com.Demo;

public class demo {

	int x = 111;
	
	{
		x = 222;

	}

	public demo(int x) {

		x = x;
	}
	
	void m1() {
		 System.out.println(x);
	}

	public static void main(String[] args) {
		
		demo dd = new demo(333);  
		dd.m1();
			
		}

}
