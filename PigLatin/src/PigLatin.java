import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Pig Latin Translator");
		System.out.println("Please type in a word to be translated into pig latin");
		
		Scanner reader = new Scanner(System.in);
		String input = reader.next();
		
		// check first condition for pig Latin
		if (startwithvowel(input) == true) {
			System.out.println(input + "yay");
		}
		
		// check third condition for pig Latin
		if (checkforanyvowels(input) == false) {
			System.out.println(input + "ay");
		}
		
		
		
		// check second condition for pig Latin
		if ((startwithvowel(input) == false) && (checkforanyvowels(input) == true)) {
			int position = positionoffirstvowel(input);
			//System.out.println(position);
			String newstring = input.substring(0,position);
			String prestring = input.substring(position);
			System.out.println(prestring+newstring + "ay");
		}
	}
		
	public static boolean startwithvowel(String s) {
//		String temp = s.toLowerCase();
		char[] vowels = {'a','e','i','o','u'};
		char firstc = s.charAt(0);
		
		for (int i =0; i < vowels.length; i++) {
			if (firstc == vowels[i]) {
				return true;
			}
		}
		
		return false;
		
	}
	
	
	public static boolean checkforanyvowels(String s) {
//		String temp = s.toLowerCase();
		char[] vowels = {'a','e','i','o','u'};
		int position = -1;
		
		for (int i = 0; i < vowels.length; i++) {
			position = s.indexOf(vowels[i]);
			if (position > -1) {
				break;
			}
		}
		
		if (position == -1) {
			return false;
		} else {
			return true;
		}
		
		
	}
	
	public static int positionoffirstvowel(String s) {
		char[] vowels = {'a','e','i','o','u'};
		for (int i=0; i < s.length(); i++) {
			for (int j=0; j < vowels.length; j++) {
				if (s.charAt(i) == vowels[j]) {
					return i;
				}
			}
		}
		return -1;
	}
	
	
	
}

