
public class Condo implements Rentable {
	
	public double weeklyRate;
	public String name;
	
	public Condo (String roomName, double weeklyRate) {
		this.name = roomName;
		this.weeklyRate = weeklyRate;
		
	}
	
	public String getDescription() {
		return (name);
	}
	
	public double getDailyRate() {
		return (weeklyRate/7);
	}
	
	public double getPrice(double days) {
		return getDailyRate() * days;
	}

}
