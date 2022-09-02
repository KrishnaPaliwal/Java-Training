package com.overriding;

import com.eNum.Level;

public class TestCarExample {
	public static void main(String add[]) {
		String s = Car.NAME;
		Car car = new BmwCar();
		int speed = car.calculateSpeed(5);
		car.carSize();
		Level l = Level.MEDIUM;
		if (car instanceof HyundaiCar) {
			car.name = "Hyundai Car";
			((HyundaiCar) car).brandName = "Hyundai";
			((HyundaiCar) car).origination = "South Korea";
			car.speed = speed;
		}
		String e = Car.NAME;
		if (car instanceof BmwCar) {
			car.name = "BMW Car";
			((BmwCar) car).price = 100000000;
			car.speed = speed;
		}

		System.out.println(car);
	}
}
