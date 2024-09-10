package Model_mm;


public class Customer {
	private  String name;
	private int Id;
	private String address;
	private static int count =0 ;
	public static final int Max_Customer_Count =100 ;
	public Customer (String name,int Id,String address) {
		
		this.name = name ;
		this.Id   = Id;
		this.address = address ;
		count++;
			
	}
	public static int getCount() {
		return count;
		
	}
	  public static void setCount(int count) {
	        Customer.count = count;
	}
	 public String getName() {
			return name;
			
	}
	 public  void setName(String name) {
		  this.name= name;
	 }
	public void setId(int Id) {
	        this.Id = Id;
	}

	public String getAddress() {
	        return address;
	}

	public void setAddress(String address) {
	    this.address = address;
	}
	 
 	
	 
	@Override
	public String toString() {
		String res ="Customer name :"+ this.name+"\n";
	 res +="Customer Id :"+ this.Id+"\n";
		 res +="Customer address :"+ this.address+"\n";
		 return res;
	} 
	  
		  
		        
	 

}
