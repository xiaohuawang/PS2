package com;

public class FourStroke extends Engine {

	public FourStroke(int id, double volume, double fuelCapacity, char fuelType) {
		super(id, volume, fuelCapacity, fuelType);
	}

	
	public double getMileage() {
		double mileage=0.0;
		if(fuelType=='g'){
			mileage = volume*4*3/1000  + fuelCapacity/2;
		}else if(fuelType=='d'){
			mileage = volume*4*2/1000  + fuelCapacity/4;
		}
		return mileage;
	}

}
