package com.overriding;

public class MethodOverloadTest {
	public static void main(String add[]) {	
		MethodOverloadTest mot = new MethodOverloadTest();
		mot.xMethod(3);
		//mot.x(null);	
	}
	
	void xMethod(int a) {
		System.out.println("xMethod(int a) called");
	}	
	void xMethod(Integer a) {
		System.out.println("xMethod(Integer a) called");
	} 

	/*
	 * void xMethod(Short a) { System.out.println("xMethod(Integer a) called"); }
	 */
	void xMethod(short a) {
		System.out.println("xMethod(short a) called");
	}	
	void xMethod(double a) {
		System.out.println("xMethod(double a) called");
	}	
	void xMethod(byte a) {
		System.out.println("xMethod(byte a) called");
	}	
	void xMethod(long a) {
		System.out.println("xMethod(long a) called");
	}
}
