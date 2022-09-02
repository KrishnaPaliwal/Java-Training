package com.passByReference;

public class PassByReferenceExample {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setAge(30);
		customer.setFirstName("Ajay");
		customer.setSurname("Mishra");

		Address address = new Address();
		address.setHouseNumber(233);
		address.setStreetName("Jawahar marg");

		customer.setAddress(address);

		System.out.println("customer        : "+customer);

		Customer updatedCustomer = customer.updateCustomerDetails(40, "Sharma", true);

		System.out.println("updatedCustomer : "+updatedCustomer);

		Customer utilCustomer = CustomerUpdateUtility.updateCustomerDetails(customer);

		System.out.println("utilCustomer    : "+utilCustomer);
		
		System.out.println("customer        : "+customer);
		
		System.out.println(customer == updatedCustomer);
		System.out.println(customer == utilCustomer);
		System.out.println(customer.equals(utilCustomer));

		Customer c1 = new Customer();
		Customer c2 = new Customer();
		System.out.println(c1==c2);
		//System.out.println(c1.equals(c2));
		Customer newVikasCustomer1 = new Customer();
		newVikasCustomer1.setId(2);
		newVikasCustomer1.setAge(70);
		newVikasCustomer1.setFirstName("Vikas");
		newVikasCustomer1.setSurname("Dubey");
		
		Address ajayAddress1 = new Address();
		ajayAddress1.setHouseNumber(233);
		ajayAddress1.setStreetName("Jawahar marg");
		newVikasCustomer1.setAddress(ajayAddress1);
		
		System.out.println(customer.equals(newVikasCustomer1));
		System.out.println(customer == newVikasCustomer1);
		
		
		Customer newVikasCustomer2 = new Customer();
		newVikasCustomer2.setId(2);
		newVikasCustomer2.setAge(70);
		newVikasCustomer2.setFirstName("Vikas");
		newVikasCustomer2.setSurname("Dubey");

		Address ajayAddress2 = new Address();
		ajayAddress2.setHouseNumber(233);
		ajayAddress2.setStreetName("Jawahar marg");
		newVikasCustomer2.setAddress(ajayAddress2);

		System.out.println("newVikasCustomer1 == newVikasCustomer2 :"+ (newVikasCustomer1 == newVikasCustomer2));
		System.out.println("newVikasCustomer1.equals(newVikasCustomer2) :"+ (newVikasCustomer1.equals(newVikasCustomer2)));
	}
}
