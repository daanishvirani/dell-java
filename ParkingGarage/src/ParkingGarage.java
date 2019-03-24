

public class ParkingGarage {
	
	private int spots;
	
	private car[] parkingSpots;
	
	
	//Getters and setters
	public int getSpots() {
		return spots;
	}


	public void setSpots(int spots) {
		this.spots = spots;
	}

	public car[] getCars() {
		return parkingSpots;
	}

	public void setCars(car[] cars) {
		this.parkingSpots = cars;
	}


	
	//Methods
	public void park(car car, int spots) {
		try {
			if (parkingSpots[spots]==null) {
				parkingSpots[spots]=car;
			} else {
				System.out.println("Already a car in the parking spot. Please choose another spot!");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This parking spot location does not exsist. Garage holdes less spots than what you requested. \n");
		}
		
		

		
		
	}
	
	public void vacate(int spot) {
		if (parkingSpots[spot]!=null) {
			parkingSpots[spot]=null;
		} else {
			System.out.println("There is no car in the spot. Nothing to vacate!");
		} 
		
		
	}
	
	
	//printing out car details --> Car location, make, model, license number and color
	public void printInventory() {
		for (int i=0; i<parkingSpots.length; i++) {
			if (parkingSpots[i] != null) {
				System.out.println("Description of Vehicle is below:");
				System.out.println("Car Spot Number is: " + i);
				System.out.println("Car Make: " + parkingSpots[i].getMake());
				System.out.println("Car Mode: " + parkingSpots[i].getModel());
				System.out.println("Licence Plate Number: " + parkingSpots[i].getLicense());
				System.out.println("Car Color: " + parkingSpots[i].getColor() + "\n");
			}
		}
		
	}
	
	//constructor
	public ParkingGarage() {
		
	}
	//Constructor
	ParkingGarage(int spotsNum) {
		parkingSpots = new car[spotsNum];
	}
	


}
