
public class Car extends Vehicle {
	
	private String type;
	private int numDoors;
	
	public void printDescription() {
		
	}
	
	public String getType() {
		return this.type;
	}
	

	
	public Car(String type, int numDoors,String license,String make,String model, int price) {
		super(license, make, model,price);
		this.type = type;
		this.numDoors = numDoors;
	}

}
