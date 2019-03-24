
public class CarLotProgram {

	public static void main(String[] args) {
		// Create 2 car lots
		CarLot LotOne = new CarLot("Lot 1");
		CarLot LotTwo = new CarLot("Lot 2");
		
		Car car1 = new Car("hatchback", 4, "ABCDE23", "Jeep", "Jeep Wrangler", 30000);
		Car car2 = new Car("sedan", 4, "BDEFDL2", "Honda", "Accord", 35000);
		Truck truck1 = new Truck("large", "IEKDI23", "GM", "Silverado", 35000);
		Truck truck2 = new Truck("medium", "83JDJ23", "Dodge", "Ram", 40000);
		
		
		LotOne.addVehicle(car1);
		LotOne.addVehicle(car2);
		LotOne.addVehicle(truck1);
		LotOne.addVehicle(truck2);
		
		LotTwo.addVehicle(car1);
		LotTwo.addVehicle(car2);
		LotTwo.addVehicle(truck1);
		LotTwo.addVehicle(truck2);
		
		LotOne.printInventory();
		LotTwo.printInventory();
		

	}

}
