package com.staticexample;

public class UtilityClass {
	int i;
	static int j = 7;
	public static void method1() {
		System.out.println("This is static method");
		//i = 8;
	}
	
	public void method2() {
		System.out.println("This is instance method");
	}
}
