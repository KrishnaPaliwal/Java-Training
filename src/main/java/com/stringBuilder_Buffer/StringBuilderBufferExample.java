package com.stringBuilder_Buffer;

public class StringBuilderBufferExample {

	public static void main(String arg []) {
		StringBuilder sb = new StringBuilder("Krishna");
		sb.append("Paliwal");
		sb.append("Java");
		System.out.println(sb);
		
		StringBuffer stb = new StringBuffer("Abc");
		stb.append("sdfsf");
		
		System.out.println(stb);
		
	}
}
