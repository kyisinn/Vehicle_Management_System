package Service;

import java.io.IOException;

import Model_mm.Motorcycle;
import Model_mm.Vehicle;



public class MotorcycleRegisterationService extends VehicleRegisterationService{ 
	@Override
	public void registerProcess() throws IOException {
		System.out.println("Enter sidecar :");
		boolean hasSideCar;
		if (br.readLine().equalsIgnoreCase("yes")) {
			hasSideCar=true;
		}
		else {
			hasSideCar=false;
		}
		Vehicle cycle =new Motorcycle(this.getVehicle(),hasSideCar);
		this.setVehicle(cycle);
		vehicleList[Vehicle.getCount()-1] = cycle;
		
	}
	

}
