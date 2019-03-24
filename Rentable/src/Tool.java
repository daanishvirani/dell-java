
public class Tool implements Rentable {
	
	public double hourlyRate;
	public String name;
	
	public Tool (String roomName, double hourlyRate) {
		this.name = roomName;
		this.hourlyRate = hourlyRate;
		
	}
	
	public String getDescription() {
		return (name);
	}
	
	public double getDailyRate() {
		return (hourlyRate * 24);
	}
	
	public double getPrice(double days) {
		return getDailyRate() * days;
	}

}
