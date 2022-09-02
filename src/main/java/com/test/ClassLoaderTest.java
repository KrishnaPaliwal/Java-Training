package com.test;

public class ClassLoaderTest {
	protected int i;
	public static void main(String[] args) {

		System.out.println("class loader for HashMap: "
				+ java.util.HashMap.class.getClassLoader());
		
		System.out.println("class loader for this class: "
				+ ClassLoaderTest.class.getClassLoader());
		DataTypeExample tt = new DataTypeExample();

	}

	private class b {
		
		
	}
}