package com.Java8.function.Lambdas;

class Cl1 implements Int1 {
	public void doStuff() {
		System.out.println("Cl1.doStuff");
		Int1.super.doStuff();

	}

	public static void main(String f[]) {
		
		int num = 4+1;
		int num2 = 52_1;
		int num3 = 200000;
		String String = "Hello"+5.4;
		new Cl1().doStuff();
		
		new Int1(){}.doStuff();
		
		System.out.println(num2);
	}
}