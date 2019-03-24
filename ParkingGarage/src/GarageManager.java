
public class GarageManager {

	public static void main(String[] args) {
		
		//Creating a few cars 
		car Toyota = new car ("Toyota","Camry","white","123-4567");
		car Nissan = new car ("Nissan", "Altima","black","765-4321");
		car Hyundai = new car ("Hyundai","Elantra","silver","abc-1234");
		car Honda = new car ("Honda","Accord","red","392-dj8d");
		car BMW = new car ("BMW","BMW i3","silver","ddd-9838");
		
		
		//Create a few new parking garage & Park cars in there
		ParkingGarage Garage1 = new ParkingGarage(5);
		ParkingGarage Garage2 = new ParkingGarage(10);
		ParkingGarage Garage3 = new ParkingGarage(20);
		
		
		//Parking cars in Garage1
		Garage1.park(Toyota,1);
		Garage1.park(Nissan,4);
		Garage1.park(Hyundai,2);
		
		//Unpark the nissan
		Garage1.vacate(4);
		
		//Park another car in 4
		Garage1.park(BMW,4);
		
		//Print what is in garage
		System.out.println("Parking Garage 1 Details: \n");
		Garage1.printInventory();
		
		
		//Parking cars in Garage2
		Garage2.park(Nissan,4);
		Garage2.park(Hyundai,2);
		Garage2.park(BMW, 9);
		Garage2.park(Honda,6);

		

		
		//Print what is in garage
		System.out.println("Parking Garage 2 Details: \n");
		Garage2.printInventory();
		
		
		//Parking cars in Garage3
		Garage3.park(Toyota,1);
		Garage3.park(Hyundai,20);
		Garage3.park(BMW,15);
		Garage3.vacate(4);
		
		//Print what is in garage
		System.out.println("Parking Garage 3 Details: \n");
		Garage3.printInventory();
		
	

	}

}
