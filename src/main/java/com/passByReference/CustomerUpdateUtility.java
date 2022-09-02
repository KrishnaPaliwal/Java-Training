package com.passByReference;

public class CustomerUpdateUtility {

	public static Customer updateCustomerDetails(Customer customer) {
		customer.setAge(45);
		customer.setSurname("Patil");
		customer.getAddress().setIndianResident(true);
		return customer;
		
	}
}
