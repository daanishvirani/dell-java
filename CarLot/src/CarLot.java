import java.util.ArrayList;
import java.util.List;

public class CarLot {
	
	private String name;
	private List<Vehicle> vehicles;
//	private ArrayList vehicleList = new ArrayList();
	
	public CarLot(String name) {
		this.name=name;
		vehicles = new ArrayList<Vehicle>();
	}
	
	
	public void addVehicle(Vehicle myVehicle) {
		vehicles.add(myVehicle);
		
	}
	
	public void printInventory() {
		System.out.println("There are " + vehicles.size() + " in car lot" + name);
		for (int i=0; i < vehicles.size(); i++) {
			vehicles.get(i).printDescription();
		}
		
	}

}
