package com.Collections_Class;
import java.util.*;

public class CollectionsDemo_min {
	   public static void main(String args[]) { 
		   // create link list object 
		   LinkedList list = new LinkedList();
			  
		   // populate the list  
		   list.add(-18);  
		   list.add(40);  
		   list.add(-45);  
		   list.add(12); 
			  
		   System.out.println("Min value is: " + Collections.min(list));          
		   }  

}
