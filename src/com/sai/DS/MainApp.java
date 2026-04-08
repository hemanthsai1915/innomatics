package com.sai.DS;

public class MainApp {

	public static void main(String[] args) {
	

		        VehicleStore store = new VehicleStore();

		        // create using factory
		        store.addVehicle(VehicleFactory.getVehicle("car"));
		        store.addVehicle(VehicleFactory.getVehicle("bus"));
		        store.addVehicle(VehicleFactory.getVehicle("truck"));
		        store.addVehicle(VehicleFactory.getVehicle("bike"));
		        // use all objects
		        store.showAll();
		    
		
	}

}
