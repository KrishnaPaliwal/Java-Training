package com.overriding;

public class BmwCar extends Car {

	int price;

	@Override
	public int calculateSpeed(int speed) {
		int result;
		result = speed*6;
		return result;
	}
	
	
	@Override
	public String toString() {
		return "BmwCar [price=" + price + ", speed=" + speed + ", name=" + name + ", size=" + size + "]";
	}

}
