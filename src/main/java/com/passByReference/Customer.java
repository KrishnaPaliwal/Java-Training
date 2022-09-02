package com.passByReference;

import java.util.Objects;

/**
 * 
 * @author Krishna
 * @see com.passByReference.Customer
 * @since JDK1.0
 */
public class Customer {

	private int id;
	private String firstName;
	private String surname;
	private int age;
	private Address address;

	static {
		System.out.println("Krishna ");
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Customer updateCustomerDetails(int age, String surname, boolean residentStatus) {
		this.age = age;
		this.surname = surname;
		//this.getAddress().setIndianResident(residentStatus);
		return this;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, firstName, id, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(firstName, other.firstName)
				&& id == other.id && Objects.equals(surname, other.surname);
	}

	/*
	 * @Override public boolean equals(Object obj) { Customer customer = (Customer)
	 * obj; if (this.firstName.equals(customer.firstName) && (this.age ==
	 * customer.age) && this.surname.equals(customer.surname) &&
	 * this.firstName.equals(customer.firstName) && this.id == customer.id &&
	 * this.address.houseNumber == customer.address.houseNumber &&
	 * this.address.streetName.equals(customer.address.streetName) &&
	 * this.address.indianResident == customer.address.indianResident) { return
	 * true; } else return false; }
	 */

	/*
	 * @Override public String toString() { return "Customer [id=" + id +
	 * ", firstName=" + firstName + ", surname=" + surname + ", age=" + age +
	 * ", address=" + address + "]"; }
	 */
}
