package com.exeption;

import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			int myArray[] = new int[5];
			myArray[7] = 10 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds" + e);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Divide by zero : " + e);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
		System.out.println("rest of the code");
	}
}
