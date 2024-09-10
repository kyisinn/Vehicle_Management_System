package Model_mm;
public class Car extends Vehicle{
	private int door;
	private static int count=0;
	public Car (String brand,String model,int door) {
		super( brand, model);
		this.door=door;
		count++;
		
	}
	public Car(Vehicle vehicle, int door) {
		super(vehicle);
		
		this.door=door;
		
	}
	public static int getCount() {
		return count;
		
	}
	@Override
	public void displayInfo() {
		System.out.println("**car**");
		super.displayInfo();
		System.out.println("Door : " +this.door);
		System.out.println("------------");
	}
	
	

}
