package com.anonymous_Inner;

public class AnonymousClassExample {
	
	   public static void main(String[] args) {
			MyAnonymousClass t1 = new MyAnonymousClass() {

				public void anonymousMethod() {
					System.out.println("Inside MyAnonymousClass");
				}
			};  
			t1.anonymousMethod();
	   }

}
