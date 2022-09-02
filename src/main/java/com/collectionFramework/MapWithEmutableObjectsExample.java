package com.collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapWithEmutableObjectsExample {
	
	public static void main(String ...strings ) {
		Map<String, String> map = new HashMap<>();
		String s1 = new String("name");
		String s2 = "surname"; //new String("surname");
		String s3 = new String("department");
		
		map.put(s1, "Krishna");
		map.put(s2, "Paliwal");
		map.put(s3, "IT");
		
		String getsurname = map.get(s2);
		System.out.println("getsurname "+getsurname);
		
		s2="newSurname";
		
		getsurname = map.get(s2);
		System.out.println("getsurname "+getsurname);
	}

}
