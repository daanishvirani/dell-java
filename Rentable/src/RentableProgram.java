import java.util.Scanner;

public class RentableProgram {

	public static void main(String[] args) {
		
		//Creating Rooms
		Room room1 = new Room("Best Western", 50.00);
		Room room2 = new Room("JW Marriott", 105.45);
		Room room3 = new Room("Days Inn", 75.45);
		
		//Creating Condos
		Condo condo1 = new Condo("Austin Condo",1000.00);
		Condo condo2 = new Condo("LA Condo",2000.00);
		Condo condo3 = new Condo("NYC Condo",3000.00);
		
		//Creating Tools
		Tool tool1 = new Tool("Hammer",9.99);
		Tool tool2 = new Tool("Screwdriver",4.99);
		
		//Creating Array with size 8
		Rentable[] rentalList = new Rentable[8];
		rentalList[0] = room1;
		rentalList[1] = room2;
		rentalList[2] = room3;
		rentalList[3] = condo1;
		rentalList[4] = condo2;
		rentalList[5] = condo3;
		rentalList[6] = tool1;
		rentalList[7] = tool2;
		
		
		//loop through rentable items and print info
		System.out.println("Here are all the rentable items and their daily rates");
		for (int i=0; i < rentalList.length; i++) {
			System.out.println("Rentable Item: " + rentalList[i].getDescription() + "; has a daily rate of $" + rentalList[i].getDailyRate());
		}
		
		//Ask user how many days items needs to be rented 
		System.out.println(" ");
		System.out.println("How many days would you like to rent the item");
		Scanner reader = new Scanner(System.in);
		double days = reader.nextDouble();
		reader.nextLine();
		
		//Get final price via loop
		System.out.println("Here are all the rentable items and the total price for your requested number of days.");
		for (int i=0; i < rentalList.length; i++) {
			System.out.println("Rentable Item: " + rentalList[i].getDescription() + "; total price will be $" + rentalList[i].getPrice(days));
		}
		
		
		

	}

}
