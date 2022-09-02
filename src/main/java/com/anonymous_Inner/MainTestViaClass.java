package com.anonymous_Inner;

class Polygone {
	   public void display() {
	      System.out.println("Inside the Polygon class");
	   }
	}

	class AnonymousDemo {
	   public void createClass() {

	      // creation of anonymous class extending class Polygon
	      Polygone p1 = new Polygone() {
	         public void display() {
	            System.out.println("Inside an anonymous class.");
	         }
	      };
	      p1.display();
	   }
	}

	class MainTestViaClass {
	   public static void main(String[] args) {
	       AnonymousDemo an = new AnonymousDemo();
	       an.createClass();
	   }
	}