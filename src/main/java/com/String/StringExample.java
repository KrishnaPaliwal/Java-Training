package com.String;

public class StringExample {

	public static void main(String [] args) {
		String s1 = "Krishna";
		String s2 = "Krishna";
		String s4 = "krishna";
		s4 = "Paliwal";
		System.out.println(s1==s2);
		String s3 = new String("   Krishna    ");
		System.out.println(s1==s3);
		System.out.println(s1==s4);

		System.out.println(s1.equals(s3));
		if(!s1.isEmpty()) {
			System.out.println(s1.substring(2, 5));
		}
		System.out.println(s3.charAt(5));
		s3.intern();
		s3.trim();
		System.out.println(s1.length());
		
		
	}
}
