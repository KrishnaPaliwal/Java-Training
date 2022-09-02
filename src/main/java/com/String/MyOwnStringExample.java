package com.String;

public class MyOwnStringExample {
	public static void main(String [] args) {
		String s1 = "Krishna";
		String s2 = s1.concat(" Paliwal");
		System.out.println(s1);
		System.out.println(s2);
		
		MyOwnString ms1 = new MyOwnString("Krishna");
		MyOwnString ms2 = ms1.concat(" Paliwal");
		System.out.println(ms1);
		System.out.println(ms2);
		
	}
}

class MyOwnString {
	String s;
	
	public MyOwnString(String s1)
	{
		this.s = s1;
	}
	
	public MyOwnString concat(String s2) {
		this.s = this.s+s2;
		return this;
	}

	@Override
	public String toString() {
		return "MyOwnString [s=" + s + "]";
	}
	
}
