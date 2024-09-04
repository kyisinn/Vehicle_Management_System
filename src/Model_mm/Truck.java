package Model_mm;



public class Truck extends Vehicle {
	private int payCapacity;
	private static int count=0;
	public Truck(String brand,String door,int payCapacity) {
		super(brand,door);
		this.payCapacity= payCapacity;
		count++;
	}
	public Truck (Vehicle vehicle , int payCapacity) {
		super(vehicle);
		this.payCapacity = payCapacity;
	}
	
	public static int getCount() {
		return count;
	}
	public void displayInfo() {
		System.out.println("** Truck **");
		System.out.println("Capacity :"+this.payCapacity);
	}
	
}
