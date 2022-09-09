package com.Java8.function.Lambdas;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		
		Function<Integer, Double> f = (x) -> Math.sqrt(x);
		Double result = f.apply(5);
		System.out.println(result);
	}
}
