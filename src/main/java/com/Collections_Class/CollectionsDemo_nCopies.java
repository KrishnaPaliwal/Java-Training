package com.Collections_Class;
import java.util.*;

public class CollectionsDemo_nCopies {
	   public static void main(String[] args) {
		   // create a list with n copies 
		   List list = Collections.nCopies(5, "tuitorial Point");
		   //list.add(5);
		   // create an iterator
		   Iterator itr = list.iterator();
		   Integer[] i = new Integer[] {3,3,3,3,4};
		   List alist = Arrays.asList(i);
		   //alist.add(5); 
		   System.out.println(alist);
		   System.out.println("Values are :");
		   while (itr.hasNext()){
		   System.out.println(itr.next());
		   }
		   }   
}
