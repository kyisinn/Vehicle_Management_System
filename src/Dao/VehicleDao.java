package Dao;

import Model_mm.Vehicle;

public class VehicleDao {
	public static Vehicle [] vehicleDao = new Vehicle[100];
	
	public static void DaoCreate(Vehicle vehicle) {
		vehicleDao[Vehicle.getCount()-1]= vehicle;
		
	}
	public static Vehicle[] getAll() {
		return vehicleDao;
		
	}
	public static Vehicle findbyVehId(int id ) {
		for (int i =0 ; i<Vehicle.getCount();i++ ) {
			if (vehicleDao[i].equals(id)) {
				return vehicleDao[i];
			}
		}

		return null;
		
	}

}
