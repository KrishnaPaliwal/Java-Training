package com.arrayExample;

import com.staticexample.UtilityClass;

public class ArrayExample {

	public static void main(String add []) {
		//int i = 0;
		short [] array = new short[10];
		System.out.println(array);
		System.out.println(array.getClass());
		
		int array2 [] = {1,2,3,4,45,65};
		int [] array3 = new int[] {1,2,2}; 
		int [] array4 = new int[10];
		
		array4[0] = 5;
		array4[1] = 5;
		array4[3] = 56;
		if(array4.length <10) array4[10] = 5;
		
		for(int i=0; i<array2.length; i++) {
			int j = array2[i];
			System.out.println(j);
		}
		
		int[][] dArray = new int[][] {{1,2,3,4}, {4,5,6,7}, {3,4,5,6}};
		dArray[0][0] = 7;
		
		UtilityClass [] uArray = new UtilityClass[5];
		uArray[0] = new UtilityClass();
		String [] stringArray = new String[5];
		stringArray[1] = "ffs";
		stringArray[4] = "fdfdswa";
		
		
		
		
	}
}
