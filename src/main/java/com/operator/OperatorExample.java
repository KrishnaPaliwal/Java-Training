package com.operator;

public class OperatorExample {

	public static void main(String [] ar) {
		//OperatorUtility op = new OperatorUtility();
		OperatorUtility op = new OperatorUtility(5);
		int t = op.add(2, 7);
		System.out.println(t);
		
		int r = op.plusPlus(4);
		
		System.out.println(r);
		
		op.checkGreateThen(4, 7);
		op.checkAnd(true, false);
		op.checkTernary(4, 5);
		if(op instanceof OperatorUtility) {
			System.out.println("true");
		}
	}
}
