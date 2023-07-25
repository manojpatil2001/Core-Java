package com.jbk;

public class StringArrayDemo {
	
	public static void main(String[] args) {
		
		//String[] names = {"jay","Rushi","Sachin"};
		
		String[] names;
		names = new String[5];
		
		names[0]="Rushi";
		names[1]="Raj";
		names[2]="Akshay";
		names[3]="Tejas";
		
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);
		
		for(String name:names) {
			System.out.println(name);
			
		}
		
	}
		
}

