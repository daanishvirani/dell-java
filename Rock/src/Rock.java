import java.util.Scanner;
import java.util.Random;

public class Rock {

	public static void main(String[] args) {
		
		// Asking User for an input
		System.out.println("Welcome to Rock, Paper, Scissors!\n" + 
							"Please make your selection as follows:\n" + 
							"Choose R for Rock, P for Paper, S for Scissors.");
		Scanner reader = new Scanner(System.in);
		String input = reader.next();
		
		// Getting Random Number from Computer and converting into a play
		Random rand = new Random();
		int compInt = rand.nextInt(3);
		String computerPlay = convertRandIntToPlay(compInt);
		
		//Checking who won and printing out statement of winner
		String winner = Winner(input,computerPlay);
		System.out.println("Your selection was " + input);
		System.out.println("Computer selection was " + computerPlay);
		System.out.println(winner);
		
		reader.close();
	}
	
	//Method to See Who is the Winner Between Rock Paper or Scissors
	public static String Winner(String human, String comp) {
		String result = "";
		if (human.equals(comp)) {
			result = "It's a TIE!";
		} else if (human.equals("R")) {
			if (comp.equals("S")) {
				result = "Rock beats Scissors. YOU WIN!";
			} else if (comp.equals("P")) {
				result = "Paper beats Rock. YOU LOSE!";
			}
		} else if (human.equals("P")) {
			if (comp.equals("S")) {
				result = "Scissors beats Paper. YOU LOSE!";
			} else if (comp.equals("R") ) {
				result = "Paper beats Rock. You WIN!";
			}
		} else if (human.equals("S")) {
			if (comp.equals("P")) {
				result = "Scissor beats Paper. YOU WIN!";
			} else if (comp.equals("R")) {
				result = "Rock beats Scissors. YOU LOSE!";
			}
		} else 
			result = "Invalid User Input";
		return result;
	}
	//Method to convert Random Interger to a Computer play for RPS
	public static String convertRandIntToPlay(int n) {
		String result = "";
		if (n == 0) {
			result = "R";
		} else if (n == 1) {
			result = "P";
		} else result = "S";
		return result;
	}
}
