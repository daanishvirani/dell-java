
public class Truck extends Vehicle {
	
	
	private String bedSize;
	
	
	public Truck(String bedSize,String license, String make, String model, int price) {
		super(license, make, model,price);
		this.bedSize = bedSize;
		
	}
	
	
	
	public void printDescription(){
		super.printDescription();
		System.out.println("The Bed size of truck: " + bedSize);
		
	}
	
	

	
	
}
