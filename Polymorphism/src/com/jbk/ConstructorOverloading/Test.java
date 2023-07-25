package com.jbk.ConstructorOverloading;

public class Test {
	
	public Test() {
		System.out.println(" 0 arg Test Constructor.......");
		
	}
	public Test(int x) {
		System.out.println(" int arg Test Constructor.......");
		
	}
	public Test(String x) {
		System.out.println("String arg Test Constructor.......");
		
	}
	public Test(int x, String y) {
		System.out.println("int - String arg Test Constructor.......");
		
	}
	public Test(double x) {
		System.out.println(" double arg Test Constructor.......");
		
	}
	public Test(int x, double y) {
		System.out.println("int - double arg Test Constructor.......");
		
	}

}
