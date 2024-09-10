package Dao;

import Model_mm.Customer;
import Model_mm.Vehicle;

public class CustomerDao {
	public static Customer [] customerDao = new Customer [Customer.Max_Customer_Count];
	
	public static void DaoCreate(Customer customer) {
		customerDao[Customer.getCount()-1]  = customer; 
		
	}
	public static Customer[] getAll() {
        return customerDao;
    }
	 
	
	 public static Customer findByCusName(String name) {
		 for (int i =0 ;i< Customer.getCount();i++) {
			 if (customerDao[i].getName().equalsIgnoreCase(name)) {
				 return customerDao[i];
				 
				 
			 }
		 }
		 
		return null;
		 
	 }


}
