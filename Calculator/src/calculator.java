import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		System.out.println("Hello, please provide two numbers.");
		System.out.println("Type the first number: ");
		Scanner reader = new Scanner (System.in);
		int input1 = reader.nextInt();
		System.out.println("Type the second number: ");
		Scanner reader2 = new Scanner (System.in);
		int input2 = reader2.nextInt();
		reader.close();
		reader2.close();
		int sum = input1 + input2;
		int diff = input1 - input2;
		int product = input1 * input2;
		int quo = input1/input2;
		System.out.println("The sum is "+ sum);
		System.out.println("The diff is "+diff);
		System.out.println("The product is "+product);
		System.out.println("The quotient is "+quo);
		// TODO Auto-generated method stub

	}

}
