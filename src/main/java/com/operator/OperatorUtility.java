package com.operator;

public class OperatorUtility {

	static int i=9;
	int j;
	public OperatorUtility() {
		
	}
	public OperatorUtility(int a) {
		this.j = a;
	}
	
	public int add(int a, int b) {
		int result = 0;
		if (b == 0) {
			result = a / b;
		}
		return result;
	}

	public int plusPlus(int i) {
		int result;
		result = ++i; // i= i+1;
		return result;
	}
	
	public void checkGreateThen(int a, int b) {
		if(a>b) {
			System.out.println(a +" is greater then "+b);
		}
		else {
			System.out.println(b +" is greater then "+a);
		}
	}
	
	public void checkAnd(boolean a, boolean b) {
		if(a&&b) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
	public boolean checkTernary(int a, int b) {
		boolean e = (a>b)? true : false;
		return e;
	}
}
