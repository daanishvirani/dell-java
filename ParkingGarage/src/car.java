
public class car {
	
	private String color;
	private String license;
	private String make;
	private String model; 
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	//Constructor
	public car(String make, String model, String color, String license){
		this.color = color;
		this.license = license;
		this.make = make;
		this.model = model;
		
	}
	
	public car() {
		
	}

	
	

}
