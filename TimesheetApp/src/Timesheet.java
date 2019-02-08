import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;


public class Timesheet {
	
	private List<TimesheetEntry> database;
	
	
	public Timesheet() {
		database = new ArrayList<TimesheetEntry>();
	}
	
	public void add(String project, String task) {
		TimesheetEntry timesheetentry = new TimesheetEntry(project,task);
		database.add(timesheetentry);
	}
	
	public List<TimesheetEntry> list() {
		
		return database;
	}
	
	public TimesheetEntry get(int id) {
		for (int i = 0; i < database.size();i++) {
			TimesheetEntry currEntry = database.get(i);
			int currId = currEntry.getId();
			if (currId == id) {
				return database.get(i);
			} 
		}
		
		return null;

	}
	
	public void delete(TimesheetEntry entry) {
		database.remove(entry);
	}
	
	
	public void stop(TimesheetEntry entry) {
		LocalDateTime newTime = entry.getEndTime();
		newTime = LocalDateTime.now();
		entry.setEndTime(newTime);
		
		
	}
}
