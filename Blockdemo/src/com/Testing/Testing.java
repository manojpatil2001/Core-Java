 package com.Testing;

public class Testing {
	
	public Testing() {
		System.out.println("0 arg cons");
	}
	
	{
		System.out.println("instance block");
	}
	
	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {
		
		System.out.println("main method execution");
		Testing tt = new Testing();
	}
}
