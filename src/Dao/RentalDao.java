package Dao;

import Model_mm.Rental;
import Model_mm.Vehicle;

//to store the data after rentaling so need to bulid the DAO;
public class RentalDao {
	public static Rental [] rentalDao = new Rental [Rental.Max_Renal_Count]; 
		
	public static void Daocreate (Rental rental) {
		rentalDao[Rental.getcount()-1]= rental;
		
	}
	public static Rental[] getAll() {
		return rentalDao;
		
	}
	 public static Rental findById(int id){
	        for(int i = 0; i < Rental.getCount(); i++){
	        	if (rentalDao[i].getRentalId()==(id)) {
	            //if (rentalDao[i].getRentalId().equalsIgnoreCasse(id)){
	                return rentalDao[i];
	            }
	        }
	        return null;
	
	
	 }

}
