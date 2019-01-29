import java.util.Date;
import java.time.*;


public class DriversLicense {
	
	
	public String FirstName;
	public String LastName;
	public Date DOB;
	public String dob;
	public String height;
	public char gender;
	
	
	public DriversLicense() {
		
	}
	
	//Methods
	
	//Get Full Name
	public String getFullName() {
		String name = (FirstName + " " + LastName);
		return name;

	}
	
	//Get Age
	public int getAge() {
		LocalDate today = LocalDate.now(); //today's date
		String stryear = dob.substring(6); //Gets year isolated
		int year = Integer.parseInt(stryear); // Year is no an int
		
		String strmonth = dob.substring(0,2); //Gets month isolated
		int month = Integer.parseInt(strmonth); // Month is now an int
		
		String strday = dob.substring(3,5); //Gets day isolated
		int day = Integer.parseInt(strday); //Day is now an int
		
		LocalDate birthday = LocalDate.of(year, month, day);
		Period period = Period.between(birthday, today);
		
		int age = period.getYears(); // Gets age in years
		return age;
				
		
				
//		String stryear = dob.substring(6);
//		int year = Integer.parseInt(stryear);
//		int age = 2018-year;
//		return age;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	

}
