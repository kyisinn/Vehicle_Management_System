package Model_mm;



public class Vehicle {
	private String brand;
    private String model;
    private static int count = 0; // Tracks the number of vehicles created

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        count++;
    }

    public Vehicle(Vehicle vehicle) {
        this.brand = vehicle.getBrand();
        this.model = vehicle.getModel();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Vehicle.count = count;
    }

   

	@Override
	public String toString() {
		return "Vehicle [Brand :" + brand  + "\n"+ ", Model :" + model + "]";
	}

	public void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
    }

	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
    


}
