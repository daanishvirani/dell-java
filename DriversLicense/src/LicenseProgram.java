
public class LicenseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DriversLicense myLicense1 = new DriversLicense();
		DriversLicense myLicense2 = new DriversLicense();
		DriversLicense myLicense3 = new DriversLicense();
		
		
// Setting variables for all three license 		
		myLicense1.setFirstName("Daanish");
		myLicense1.setLastName("Virani");
		myLicense1.setDob("12-18-1992");
		String name1 = myLicense1.getFullName();
		int age1 = myLicense1.getAge();
		
		
		myLicense2.setFirstName("Bob");
		myLicense2.setLastName("Jones");
		myLicense2.setDob("01-10-1980");
		String name2 = myLicense2.getFullName();
		int age2 = myLicense2.getAge();
		
		
		myLicense3.setFirstName("Kevin");
		myLicense3.setLastName("Taylor");
		myLicense3.setDob("03-10-2000");
		String name3 = myLicense3.getFullName();
		int age3 = myLicense3.getAge();
		
		
//		myLicense1.FirstName = "Daanish";
//		myLicense1.LastName = "Virani";
//		myLicense1.dob = "12-18-1992";

		
		
		
//		myLicense2.FirstName = "Bob";
//		myLicense2.LastName = "Jones";
//		myLicense2.dob = "01-10-1980";
//		String name2 = myLicense2.getFullName();
//		int age2 = myLicense2.getAge();
//		
//		
//		
//		myLicense3.FirstName = "Kevin";
//		myLicense3.LastName = "Taylor";
//		myLicense3.dob = "03-10-2000";
//		String name3 = myLicense3.getFullName();
//		int age3 = myLicense3.getAge();
//		
		
		System.out.println("Driver License name: " + name1 + ". Age: " + age1 );
		System.out.println("Driver License name: " + name2 + ". Age: " + age2 );
		System.out.println("Driver License name: " + name3 + ". Age: " + age3 );
		

	}

}
