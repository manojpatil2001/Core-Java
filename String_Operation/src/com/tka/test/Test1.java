package com.tka.test;

public class Test1 {

	public static void main(String[] args) {
		//Memory Comparason:
		// == Operator
		// String v1 = "pune";

		String v1 = "Pune";
		String v2 = "pune";
		System.out.println(v1 + " --> " + v1.hashCode());
		System.out.println(v2 + " --> " + v2.hashCode());
		System.out.println(v1 == v2);

	}

}
