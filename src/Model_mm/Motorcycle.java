package Model_mm;



public class Motorcycle extends Vehicle {
	private boolean hasSideCar;
	private static int count=0;
	public Motorcycle(Vehicle vehicle,boolean hasSideCar) {
		super(vehicle);
		this.hasSideCar = hasSideCar;
		
	}
	public Motorcycle(String brand,String model,boolean hasSideCar) {
		super( brand, model);
		this.hasSideCar = hasSideCar;
		count++;
		
	}
	public static int getCount() {
		return count;
	}
	@Override
	public void displayInfo() {
		System.out.println("**MotorCycle**");
		super.displayInfo();
		System.out.println("SideCar :"+ this.hasSideCar);
		System.out.println("------------");
		
	
	}
	

}
