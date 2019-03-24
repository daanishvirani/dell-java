
public interface Rentable {
	//interface methods
	//get description returns description of item (type string)
	public String getDescription();
	
	//get daily rate returns rate per day
	public double getDailyRate();
	
	//getPrice = price * days
	public double getPrice(double days);
	
	
}
