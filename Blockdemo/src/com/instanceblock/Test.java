package com.instanceblock;

public class Test {
	
	public Test() {
		System.out.println("Default constructor execution....");
	}
	
	public Test(int x){
		System.out.println("int arg cons execution");
	}
	
	{
		System.out.println("instance block 1 execution......");
	}
	
	{
		System.out.println("instance block 2 execution......");
	}
	
	public static void main(String[] args) {
		System.out.println("main method execution.....");
		Test tt = new Test(10);
		
	}

}
