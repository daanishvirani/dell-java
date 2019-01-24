import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


public class gradebook {
	
	public static HashMap<String, String> grades = new HashMap<String, String>();
	public static HashMap<String, Double> avggrades = new HashMap<String,Double>();

	public static void main(String[] args) {
		
		getStudentData();
		calculateGrades();
		printGrades();
		
		//Put all old names into an array list
	    //ArrayList<String> names = new ArrayList<String>(grades.keySet());
	    
	}
	
	public static void getStudentData() {
		System.out.println("How many students do you have?");
		Scanner reader = new Scanner(System.in);
		int countStudents = Integer.parseInt(reader.nextLine());
		
		for (int i=0; i<countStudents;i++) {
			System.out.println("Enter student's name: ");
			String studentName = reader.nextLine();
			
			System.out.println("Enter student's grades: ");
			String studentGrade = reader.nextLine();
			
			grades.put(studentName,studentGrade);
			
		}
		
		reader.close();
		
	}
	
	public static void calculateGrades() {
		String[] namesStudent = grades.keySet().toArray(new String[0]);
		String[] gradesStudent = grades.values().toArray(new String[0]);
		
		for(int i=0; i< gradesStudent.length;i++) {
			//String grade = gradesStudent[i];
			String [] gradeArrayString = gradesStudent[i].split(",");  //=grade.split(", ");
			int size = gradeArrayString.length;
			Integer[] intArrayGrade = new Integer[size];
			//Integer[] intArrayGrade = new Integer[gradeArrayString.length];
			
			for(int j=0; j< size; j++) {
				intArrayGrade[j]=Integer.parseInt(gradeArrayString[j]);
			}
			
			double sum = 0;
			for (int k=0; k<size; k++) {
				sum += intArrayGrade[k];
			}
			double average = sum/size;
			avggrades.put(namesStudent[i], average);
		}
	}
	
	private static void printGrades() {
		
		String[] studentNameList = avggrades.keySet().toArray(new String[0]);
		Double[] finalGradeList = avggrades.values().toArray(new Double[0]);
		
		for (int i =0; i< studentNameList.length; i++) {
			String student=studentNameList[i];
			Double avg = finalGradeList[i];
			System.out.println(student + " average grade is: " + avg);
		}
		
	}

}
