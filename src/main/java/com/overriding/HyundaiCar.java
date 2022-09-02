package com.overriding;

public class HyundaiCar extends Car {
	
	String brandName;
	String origination;

	@Override
	public int calculateSpeed(int speed) {
		int result;
		result = speed*3;
		return result;
	}

	@Override
	public String toString() {
		return "HyundaiCar [brandName=" + brandName + ", origination=" + origination + ", speed=" + speed + ", name="
				+ name + ", size=" + size + "]";
	}


	
	
}
