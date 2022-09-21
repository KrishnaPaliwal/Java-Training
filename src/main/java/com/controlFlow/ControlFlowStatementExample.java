package com.controlFlow;
public class ControlFlowStatementExample {

	  public static void main(String args[]) {
		  
		// if-else
		int i = Integer.parseInt(args[0]);
		if (i < 10) {
			System.out.println(i + " is smaller than 10");
		} else {
			System.out.println(i + " is greater than 10");
		}
		// =========================================================

		// if-elseif-else
		int j = Integer.parseInt(args[1]);
		if (j < 0) {
			System.out.println("numebr is negetive");
		} else if (j > 0) {
			System.out.println("numebr is positive");
		} else {
			System.out.println("numebr is Zero");
		}

		// =======================================================

		// while
		boolean b = Boolean.parseBoolean(args[2]);
		int k = Integer.parseInt(args[3]);
		while (b == true && k <= 10) {
			System.out.println("k :" + k++);
			if (k == 5)
				continue;
			System.out.println("Loop is executed" +k);
			if(k==7) 
				break;
		}

		// =======================================================

		// do-while

		do {
			System.out.println(i++);
			i++;
		} while (i <= 5);

		// ==========================================

		// Switch

		String month = args[4];
		switch (month) {
		case "January":
			System.out.println("This is " + month);
			break;

		case "February":
			System.out.println("This is " + month);
			break;

		default:
			System.out.println("This is another month : "+month);
		}
	}
}
