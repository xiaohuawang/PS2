package com;

public class TwoStroke extends Engine {

	public TwoStroke(int id, double volume, double fuelCapacity, char fuelType) {
		super(id, volume, fuelCapacity, fuelType);
	}

	public double getMileage() {
		double mileage=0.0;
		if(fuelType=='g'){
			mileage=volume*2*3/1000  + fuelCapacity/2;
		}
		else if(fuelType=='d'){
			mileage = volume*2*2/1000 + fuelCapacity/4;
		}
		return mileage;
	}

	
}
