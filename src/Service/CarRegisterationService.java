package Service;

import java.io.IOException;

import Model_mm.Car;
import Model_mm.Vehicle;



public class CarRegisterationService extends VehicleRegisterationService{

	@Override
	public void registerProcess() throws IOException {
		System.out.println("Enter door :");
		int door= Integer.parseInt(br.readLine());
		
		Vehicle car = new Car(this.getVehicle(),door);
		
		this.setVehicle(car);
	}


}
