package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model_mm.Vehicle;



public class VehicleRegisterationService {
public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private Vehicle vehicle;
	
	public static Vehicle [] vehicleList = new Vehicle[1000];
	
	public void create() throws IOException{
		getCommonInfo();
		registerProcess();
		
		
	}
	public void registerProcess() throws IOException{
		
	}
	public void getVehicleInfo() throws IOException{
		
		
//		if (type.equalsIgnoreCase("car")) {
//			this.getCarInfo();
//			
//			
//		}else if (type.equalsIgnoreCase("motorcycle")) {
//			this.getMotorCycleInfo();
//			
//			
//		}
//		else if(type.equalsIgnoreCase("truck")) {
//			this.getTruckInfo();
//			
//		}
//		System.out.println("Do u want to add another vehicle (yes/no) ? ");
//		flag= br.readLine();
//		}while(flag.equalsIgnoreCase("yes"));
//		
		
	}
	public void getCommonInfo()throws IOException {
		System.out.println("Enter brand : ");
		String brand = br.readLine();
		System.out.println("Enter model : ");
		String model = br.readLine();
		
	vehicle = new Vehicle (brand,model);
		
		//this.Vehicle(new Vehicle(brand, model));
		
		
		
		
	}
//	public void  getCarInfo() throws  IOException {
//		System.out.println("Enter door :");
//		int door= Integer.parseInt(br.readLine());
//		
//		vehicleList[Vehicle.getCount()] = new Car(this.brand, this.model, door);
//			
//	}
//	public void getMotorCycleInfo()throws  IOException {
//		System.out.println("Enter sidecar :");
//		boolean hasSideCar;
//		if (br.readLine().equalsIgnoreCase("yes")) {
//			hasSideCar=true;
//		}
//		else {
//			hasSideCar=false;
//		}
//		
//		vehicleList[Vehicle.getCount()] = new Motorcycle (this.brand, this.model, hasSideCar);
//		
//	}
//	public void  getTruckInfo() throws  IOException {
//		System.out.println("Enter Capacity :");
//		int capacity = Integer.parseInt(br.readLine());
//		
//		vehicleList[Vehicle.getCount()]= new Truck (this.brand, this.model, capacity);
//			
//		
//	}
	public void displayInfo() {
		for (int i=0;i<Vehicle.getCount();i++) {
			vehicleList[i].displayInfo();
			
		}
		System.out.println();
		
		
		
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	

}
