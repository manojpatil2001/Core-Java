package com.set;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
	
		//HashSet s = new HashSet<>();
		
		Set ss = new HashSet<>();
		
		
		ss.add(1.5);
		ss.add(2);
		ss.add("sai");
		ss.add(true);
		ss.add(2);
		
		for(  Object a   : ss) {
			System.out.println(a);
		}
		
		
		
		
//		System.out.println(ss);
//		ss.remove("sai");
//		System.out.println(ss);
	}

}
