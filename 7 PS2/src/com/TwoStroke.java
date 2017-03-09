package com;

public class TwoStroke extends Engine {

	public TwoStroke(int id, double volumn, double fuelCapacity, char fuelType) {
		super(id, volumn, fuelCapacity, fuelType);
	}

	public double getMileage() {
//		Mileage = volume*2*3/1000  + fuelCapacity/2
		return 0;
	}

	
}
