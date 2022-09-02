package com.collectionFramework;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.DelayQueue;

public class SetExample {
	public static void main(String add []) {
		Set<String> set = new HashSet<String>();
		boolean b1 = set.add("r");
		boolean b2 = set.add("a");
		boolean b3 = set.add("r");
		System.out.println(b1);
		System.out.println(b2);		
		System.out.println(b3);
		
		for(String s : set) {
			System.out.println(s);
		}
		
		Set<Country> countrySet = new HashSet<>();
		
		Country s1 =new Country("India", 10000) ;
		Country s2 =new Country("India", 10000) ;
		Country s3 =new Country("India", 10000) ;
		
		countrySet.add(s1);
		countrySet.add(s2);
		countrySet.add(s3);
		System.out.println(countrySet);
	}
}
