package com.overriding;

public class Car {
	static final String NAME="XYZ";

	int speed;
	String name;
	String size;
	
	public int calculateSpeed(int speed) {
		return this.speed = speed;
	}
	
	public void carSize() {
		this.size = "SUV";
	}
}
