import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Hi, What's your name?");
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		System.out.println("Hi, " + input + " hope you are doing well!");
		// TODO Auto-generated method stub

	}

}
