package com;

public abstract class Engine {

	int id;
	double volumn;
	double fuelCapacity;
	char fuelType;
	
	public abstract double getMileage();
	
	public Engine(int id, double volumn, double fuelCapacity, char fuelType){
		this.id=id;
		this.volumn=volumn;
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
		return volumn;
	}

	public void setVolumn(double volumn) {
		this.volumn = volumn;
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
