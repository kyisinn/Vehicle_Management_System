
package Service;

import Dao.VehicleDao;
import Model_mm.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RentalService {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Vehicle vehicle;
    private static Vehicle[] vehicleList = new Vehicle[100];  
    private static int vehicleCount = 0; 
    private VehicleDao vehicleDao;

    
    public void getCommonInfo() throws IOException {
        System.out.print("Enter Vehicle Brand: ");
        String brand = br.readLine();
        System.out.print("Enter Vehicle Model: ");
        String model = br.readLine();
        System.out.print("Enter Vehicle Rent Price: ");
        double rentPrice = Double.parseDouble(br.readLine());
        vehicle = new Vehicle(brand, model);
    }

    public void createVehicle() throws IOException {
        getCommonInfo();
        getRegisterInfo(); 
        VehicleDao.DaoCreate(vehicle); 
        
      
        if (vehicleCount < vehicleList.length) {
            vehicleList[vehicleCount] = vehicle;
            vehicleCount++;
        } else {
            System.out.println("Vehicle list is full. Cannot register more vehicles.");
        }
    }


    public Vehicle getVehicle() {
        return vehicle;
    }


    public static Vehicle[] getVehicleList() {
        return vehicleList;
    }

    
    public void getRegisterInfo() throws IOException {
        
    }

    public void display() {
        for (int i = 0; i < vehicleCount; i++) {
            vehicleList[i].displayInfo();
        }
        System.out.println();
    }

   
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}


//package Service;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//import Dao.CustomerDao;
//import Dao.RentalDao;
//import Dao.VehicleDao;
//import Model_mm.Customer;
//import Model_mm.Rental;
//import Model_mm.Vehicle;
//
//public class RentalService {
//	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//	
//	//private Rental rental;
//	
//	public  void callService() throws IOException {
//	Customer customer = getCustomerName();
//	if(customer==null) {
//		System.out.println("No valid customer found");
//		return;
//	}
//	Vehicle vehicle = getVehicleId();
//	if(vehicle==null) {
//		System.out.println("No valid  found");
//		return;
//	}
//	
//	int days =getRentalDays();
//	
//	//RentalDao.getAll()
//	
//	RentalDao.Daocreate(new Rental (customer,vehicle ,days));
//	
//	}
//	private Vehicle getVehicleId()throws IOException {
//		while(true) {
//		System.out.print("Enter Vehicle id: ");
//	
//	   int Id = Integer.parseInt(br.readLine());
//	   Vehicle vehicle =VehicleDao.findbyVehId(Id);
//	   if(vehicle !=null) {
//	    	 return vehicle;
//	   }
//	   else {
//		   System.out.println("Vehicle ID not found.Try again. ");
//		
//	   		}
//	   
//		}
//	}
//	   	   
//	private int getRentalDays() throws IOException {
//		 System.out.print("Enter Rental Days");
//	     int rentDay = Integer.parseInt(br.readLine());
//		return rentDay;
//		
//	}
//	private Customer getCustomerName() throws  IOException {
//		while(true) {
//		System.out.print("Enter Customer id: ");
//		String name  = br.readLine();
//        Customer customer = CustomerDao.findByCusName(name);
//        if(customer !=null) {
//	    	 return customer;
//       	 
//        }else {
//		   System.out.println(" Customer name not found .Try Again ");
//		   
//        	}
//		}
//	
//		
//	}
//
//	
//}
