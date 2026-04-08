package com.sai.DS;

public class VehicleFactory {

	public static Vehicle getVehicle(String type)
	{
		switch(type){
			case "car":return new Car();
			case "bus":return new Bus();
			case "truck":return new Truck();
			case "bike":return new Bike();
			default:return null;
		}
	}
}
