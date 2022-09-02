package com.collectionFramework;

import java.util.Objects;

public class DummyCountry extends Country {

	private String newCountryName;
	private long newPopulation;

	public DummyCountry(String countryName, long population) {
		super(countryName, population);
		this.newCountryName = countryName;
		this.newPopulation = 10000;
	}

	@Override
	public String getCountryName() {
		return newCountryName;
	}

	@Override
	public long getPopulation() {
		return newPopulation;
	}

	public String getNewCountryName() {
		return newCountryName;
	}

	public void setNewCountryName(String newCountryName) {
		this.newCountryName = newCountryName;
	}

	public long getNewPopulation() {
		return newPopulation;
	}

	public void setNewPopulation(long newPopulation) {
		this.newPopulation = newPopulation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(newCountryName, newPopulation);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		DummyCountry other = (DummyCountry) obj;
		return Objects.equals(newCountryName, other.newCountryName) && newPopulation == other.newPopulation;
	}

}
