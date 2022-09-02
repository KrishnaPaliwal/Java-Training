package com.anonymous_Inner.viaInterface;

interface Polygon {
	   public void display();
	}

	class AnonymousDemo {
	   public void createClass() {

	      // anonymous class implementing interface
	      Polygon p1 = new Polygon() {
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