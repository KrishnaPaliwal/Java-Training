package com.test;

import com.utility.TestClass;

//import com.utility.TestClass;

public class MyFirstClass {
	static int i;
	public int a;
	static {
		System.out.println("Im am in Static block");
		i=5;
	}
	public static void main(String [] dffddf) {
		System.out.println("First Program");
		MyFirstClass myObject;
		myObject = new MyFirstClass();
		//myObject.method1("Test");
		int a = myObject.i;
		TestClass tc = new TestClass();
		
	}
	
	public String method1(String s, int i) {
		System.out.println(s);
		return s;
	}
	
	public void method2(String s) {
		System.out.println(s);
	}
	
	public void method3() {
		System.out.println("s");
	}
	
}
