package com.methodOverloading;

public class Shape {

	public int calculatePerimeter(int a, int b, int c) {
		int result = a+b+c;
		System.out.println("Shape of triangle is calculated is "+ result);
		return result;
	}
	
	public double calculatePerimeter(int a, int b, int c, int d) {
		double result = a+b+c+d;
		System.out.println("Shape of rectangle is calculated is "+ result);
		return result;
	}
	
	public String calculatePerimeter(String a, int b, int c) {
		String result = a+b+c;
		return result;
	}
	
}
