package Model_mm;

public class Rental {
	public static final int Max_Renal_Count =100 ;
	private Customer customer;
	private Vehicle vehicle;
	private int rentalDay;
	private double totalPrice ;
	private static int count =0;
	private int rentalId;
	
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public static int getCount() {
		return count;
	}
	
	public Rental (Customer customer,Vehicle vehicle,int rentalDay) {
		this.customer =customer ;
		this.vehicle = vehicle ;
		this.rentalDay = rentalDay;
		count++;
		this.rentalId =count;
		
	}
	public void CalculateTotalPrice() {
		this.totalPrice =this.vehicle.getTotalPrice()*rentalDay;
	}
	
	public static int getcount() {
		return count;
		
	}
	public int getRentalId() {
		return rentalId;
		
        
    }
	
	@Override
	public String toString() {
		String res ="Customer  :"+ this.customer+"\n";
		 res +="Vehicle  :"+ this.vehicle+"\n";
		 res +="Rrental days :"+ this.rentalDay+"\n";
		 return res;
		
		
	}
	

}
