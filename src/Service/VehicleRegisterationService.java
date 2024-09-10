package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Dao.VehicleDao;
import Model_mm.Vehicle;
import Model_mm.Rental;
import Service.RentalService;


public class VehicleRegisterationService {
public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private Vehicle vehicle;
	private double price;
	
	public void create() throws IOException{
		getCommonInfo();
		registerProcess();
		VehicleDao.DaoCreate(vehicle);
		//createRentalInfo();
		
	}
	
	
	public void registerProcess() throws IOException{
	
		
	}
	
	public void getVehicleInfo() throws IOException{
				
	}
	public void getCommonInfo()throws IOException {
		System.out.println("Enter Vehicle Brand  : ");
		String brand = br.readLine();
		System.out.println("Enter Vehicle Model : ");
		String model = br.readLine();
		System.out.println("Enter Rental Prince per Day : ");
		double price = Double.parseDouble(br.readLine());
		
	vehicle = new Vehicle (brand,model);
	}
		
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//	}
	public void displayInfo() {
		for (int i=0;i<Vehicle.getCount();i++) {
			System.out.println(VehicleDao.getAll()[i]);
			
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
