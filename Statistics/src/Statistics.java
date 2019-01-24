import java.util.Scanner;


public class Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter list of numbers separated by commas.");
		Scanner reader = new Scanner(System.in);
		String numberList = reader.nextLine();
		reader.close();
		String[] numberListArray = numberList.split(",");
		
		
		// Create an integer array to store converted user input
		Integer[] intArray = new Integer[numberListArray.length];
		for (int i = 0; i < numberListArray.length; i++) {
			Integer num = Integer.parseInt(numberListArray[i]);
			intArray[i] = num; 
		}
		
		
		int min = FindMin(intArray);
		int max = FindMax(intArray);
		int sum = add(intArray);
		int length = NumElements(intArray);
		double avg = average(intArray);
		
		System.out.println("The minimum is " + min);
		System.out.println("The maximum is " + max);
		System.out.println("The sum is " + sum);
		System.out.println("The length is " + length);
		System.out.println("The average is " + avg);
		
		

	}
	
	public static int FindMax(Integer[] a) {
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	
	public static int FindMin(Integer[] a) {
		int min = a[0];
		
		for (int i=1; i<a.length;i++) {
			if (a[i]<min) {
				min = a[i];
			}
		}
		return min;
	}

	
	public static int NumElements(Integer[] a) {
		int numElements = a.length;
		return numElements;
	}
	
	public static int average(Integer[] a) {
		int total = 0;
		for (int i = 0; i <a.length; i++) {
			total += a[i];
		}
		int numElements = a.length;
		int average = total/numElements;
		return average;
	}
	
	
	public static int add(Integer[] a) {
		int total = 0;
		for (int i=0;i<a.length;i++) {
			total += a[i];
		}
		return total;
	}
	
	
	

}
