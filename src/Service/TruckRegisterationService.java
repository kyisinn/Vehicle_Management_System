package Service;

import java.io.IOException;

import Model_mm.Truck;
import Model_mm.Vehicle;



public class TruckRegisterationService extends VehicleRegisterationService{
	@Override
	public void registerProcess() throws IOException {
		System.out.println("Enter Capacity :");
		int capacity = Integer.parseInt(br.readLine());
		Vehicle truck = new Truck(this.getVehicle(), capacity);
		this.setVehicle(truck);
		
	}


}
