package com.list;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
	
	//ArrayList aa = new ArrayList<>();
//	List aa = new ArrayList<>();
	
	
//Integer obj = Integer.valueOf(10);
	
	
//	aa.add(1);
//	System.out.println(aa);
	
	List aa = new ArrayList<>();
	aa.add(1.5);
	aa.add(2);
	aa.add("sai");
	aa.add(true);
	aa.add(2);
	
	for( Object a  : aa) {
		System.out.println(a);
	}
	
	
//	for(int i=0 ; i<=4 ; i++) {
//		System.out.println(i+" ---> "+aa.get(i));
//	}
	
	
	
//	System.out.println(aa);
//	aa.remove("sai");
//	System.out.println(aa);
	
	}	
}
