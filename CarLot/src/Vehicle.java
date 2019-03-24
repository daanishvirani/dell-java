
public abstract class Vehicle {

	private String licenseNumber;
	private String make;
	private String model;
	private int price;
	

	
	public Vehicle(String license,String make2, String model2,int price2) {
		licenseNumber = license;
		make = make2;
		model = model2;
		price = price2;
		// TODO Auto-generated constructor stub
	}


	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String mylicenseNumber) {
		licenseNumber = mylicenseNumber;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String mymake) {
		make = mymake;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String mymodel) {
		model = mymodel;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int myprice) {
		price = myprice;
	}

	public void printDescription() {
		System.out.println("Below is the vehicle's description: ");
		System.out.println("This is a " + make + " " + model + ". The current price is " + price + ". License Number is " + licenseNumber + ".");
	}
	
}
