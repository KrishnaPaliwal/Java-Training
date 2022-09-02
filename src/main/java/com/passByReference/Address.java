package com.passByReference;

import java.util.Objects;

public class Address {
	int houseNumber;
	String streetName;
	boolean indianResident;

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public boolean isIndianResident() {
		return indianResident;
	}

	public void setIndianResident(boolean indianResident) {
		this.indianResident = indianResident;
	}

	@Override
	public int hashCode() {
		return Objects.hash(houseNumber, indianResident, streetName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return houseNumber == other.houseNumber && indianResident == other.indianResident
				&& Objects.equals(streetName, other.streetName);
	}

	/*
	 * @Override public String toString() { return "Address [houseNumber=" +
	 * houseNumber + ", streetName=" + streetName + ", indianResident=" +
	 * indianResident + "]"; }
	 */

}
