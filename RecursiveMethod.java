package com.technoelevate.recursion;

public class RecursiveMethod {
	public static void test() {
		System.out.println("from test");
		demo();
	}
	public static void demo() {
		System.out.println("From demo");
		test();
	}
	public static void main(String[] args) {
		test();
	}
  
}
    
    	

