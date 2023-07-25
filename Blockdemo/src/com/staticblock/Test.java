package com.staticblock;

public class Test {
	
	static{
		System.out.println("static block 1 execution");
	}
	static {
		System.out.println("static block 2 execution");
	} 
	

	public static void main(String[] args) {
		System.out.println("main method execution ");
		 
	}
}
