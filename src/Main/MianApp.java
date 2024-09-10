package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Service.CarRegisterationService;
import Service.MotorcycleRegisterationService;
import Service.RentalService;
import Service.TruckRegisterationService;
import Service.VehicleRegisterationService;


public class MianApp {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static RentalService rentalservice = new RentalService();


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		VehicleRegisterationService service = null;
		
		String flag;
		do {
			System.out.print("Enter Vehicle Type(Car/Truck/Cycle):");
			String type =br.readLine();
		if (type.equalsIgnoreCase("car")) {
			service= new CarRegisterationService();
			
			
		}else if (type.equalsIgnoreCase("cycle")) {
			service = new MotorcycleRegisterationService();
			
			
		}
		else if(type.equalsIgnoreCase("truck")) {
			service =new TruckRegisterationService();
			
		}
		service.create();
		service.getVehicleInfo();
		System.out.println("Do u want to add another vehicle (yes/no) ");
		flag= br.readLine();
		
		}while(flag.equalsIgnoreCase("yes"));
		
		service.displayInfo();
		//CreateRentalInfo();
		
		
	}
//	private static void CreateRentalInfo()throws IOException {
//		rentalservice.callService();
//		//System.out.println("Do you want to add another Rental (yes/no) ");
//		String flag = br.readLine();
//		if(flag.equalsIgnoreCase("yes")){
//			CreateRentalInfo();
//		}
//		
//	}

	

}
