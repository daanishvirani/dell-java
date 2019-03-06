import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.List;

public class WordGuessGame {

	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		ArrayList<String> words_alpha = new ArrayList<String>();
		
		try {
			in = new BufferedReader(new FileReader("words_alpha.txt"));

			
			String line;
			while((line=in.readLine()) !=null ) {
				words_alpha.add(line);
			}
		} finally {
			if (in != null) {
				in.close();
			}
	}
		
		//Get the random work to guess
		String guessWord = getWord(words_alpha);
		
		String guessWord2 = guessWord;
		System.out.println(guessWord);
		play(guessWord2);
		

}
	
	public static String getWord(ArrayList<String> wordList) {
		Random randNumGen = new Random();
		int randNum = randNumGen.nextInt(wordList.size());
		
		String genWord = wordList.get(randNum);
		return genWord;
		
	}
	
	
	
	public static void play(String word) {
		System.out.println("Welcome to Word Guess Game");
		System.out.println("Your word has " + word.length() + " letters.");
		
		String dashes = "";
		for (int i=0; i<word.length();i++) {
			dashes += "-";
		}
		System.out.print(dashes);
		System.out.println("");
		
		int correctletters = 0; 
		
		Scanner reader = new Scanner(System.in);
		
		while (correctletters < dashes.length()) {
			System.out.println("Please type in a letter");
			String input = reader.nextLine();
			char c = input.charAt(0);
			
			
			
			if (word.contains(input)) {
				
				for (int i = 0; i < word.length(); i++) {
					// compare c to letter at i and if it matches
					//if matches then add that to the dashes and continue down the loop
					//if doesn't match continue down the loop
				}
				
				int index = word.indexOf(input);
				
				StringBuilder myName = new StringBuilder(dashes);
				myName.setCharAt(index, c);
				
				dashes = myName.toString();

				System.out.println(dashes);
				correctletters += 1;
				System.out.println(correctletters);
				System.out.println(dashes.length());
				
			} else {
				System.out.println("Letter does not exist in the word");
			}
			
			
		}
		
		reader.close();
		System.out.println(dashes);
		
	}
	
}
