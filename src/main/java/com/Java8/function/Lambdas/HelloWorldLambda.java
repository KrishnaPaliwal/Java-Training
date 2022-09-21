package com.Java8.function.Lambdas;

public class HelloWorldLambda {

	public static void main(String [] args) {
		
		HelloworldInterface helloWorldInterface = (x,y) ->  x+" "+y;
		
		String s = helloWorldInterface.sayHelloWorld("Hello", "Wolrd");
		
		System.out.println(s);

	}
}
