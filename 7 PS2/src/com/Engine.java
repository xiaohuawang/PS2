package com;

public abstract class Engine {

	int id;
	double volume;
	double fuelCapacity;
	char fuelType;
	
	public abstract double getMileage();
	
	public Engine(int id, double volume, double fuelCapacity, char fuelType){
		this.id=id;
		this.volume=volume;
		this.fuelCapacity=fuelCapacity;
		this.fuelType=fuelType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getVolumn() {
		return volume;
	}

	public void setVolumn(double volumn) {
		this.volume = volumn;
	}

	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public char getFuelType() {
		return fuelType;
	}

	public void setFuelType(char fuelType) {
		this.fuelType = fuelType;
	}
	
}
