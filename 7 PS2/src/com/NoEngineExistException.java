package com;

public class NoEngineExistException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage(){
		return "No Engine Exists With Greater Mileage";
	}
	
	
}
