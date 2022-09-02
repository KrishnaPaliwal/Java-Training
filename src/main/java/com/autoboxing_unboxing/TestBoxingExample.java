package com.autoboxing_unboxing;

public class TestBoxingExample {

	public static void main(String add []) {
		int a =8;
		short b=9;
		//Integer x = new Integer(10);
		Autoboxing_Unboxing au = new Autoboxing_Unboxing();
		Integer s = au.autoBoxing(a, b);
		System.out.println(s);
		int f = au.unBoxing(Integer.valueOf(5), Short.valueOf((b)));
		int f2 = au.unBoxing(new Integer(5), new Short((b)));
		
		int f3 = au.unBoxing(new Integer(5), (short) 3);
		
		System.out.println(f);
	}
}
