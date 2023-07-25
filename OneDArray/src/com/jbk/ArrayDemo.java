package com.jbk;

public class ArrayDemo {
	
	
	public static void main(String[] args) {
		
	
	String[] arr = new String[3];
//Revers String
	
	arr[0]="Vishal";
	arr[1]="Akshay";
	arr[2]="Sujan";
	
	for (int i = arr.length-1 ; i >= 0 ; i--) {
		
			System.out.println(arr[i]);
		}

	}
}
