package com.methodOverloading;

public class OverloadingTestClass {

	public static void main(String add []) { 
		Shape shape = new Shape();
		shape.calculatePerimeter(4, 5, 6);
		shape.calculatePerimeter(4, 6, 7, 3);
	}
}
