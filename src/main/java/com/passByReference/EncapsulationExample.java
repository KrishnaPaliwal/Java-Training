package com.passByReference;

public class EncapsulationExample {

	public static void main(String[] a) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		Customer c4 = new Customer();

		c1.setAge(20);
		c1.updateCustomerDetails(44, "dsfeg", false);
		c2.setAge(40);
		c2.updateCustomerDetails(56, "hhhhh", true);
		c3.setAge(50);
		c4.setAge(70);
	}
}
