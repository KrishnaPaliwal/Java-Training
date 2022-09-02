package com.collectionFramework;

import java.util.*;
import java.util.concurrent.*;

import com.passByReference.Customer;


public class ListExample {
	public static void main(String add []) {
		List<Integer> list = new CopyOnWriteArrayList<Integer>();		
		List<Customer> clist = new CopyOnWriteArrayList<Customer>();
		list.add(5);
		list.add(6);
		list.add(55);
		boolean b1 = list.add(6); //3
		boolean b2 = list.add(6);
		list.add(4);
		list.add(7);
		//list.add(null);
		list.add(3,45);
		list.add(8, 44);
		Collections.sort(list);
		list.sort(null);
		System.out.println(b1);
		System.out.println(b2);	
		System.out.println(list.toString());
		if(list.contains(5)) {
			System.out.println("True");
		}
		list.get(5);
		
		for(Integer in : list) {
			System.out.println(in);
			list.add(4);
		}
		
		Iterator< Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			list.add(4);
		}

		list.clear();
		System.out.println(list);
		
		if(list.isEmpty()) {
		System.out.println("Empty");	
		}
		
		//list.sort(list);
	}
}
