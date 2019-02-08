import java.time.LocalDateTime;


public class TimesheetEntry {
	
	
	private static int NEXTID=1;
	
	//Variables
	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	//Constructor
	public TimesheetEntry(String myProject,String myTask) {
		projectName = myProject;
		startTime = LocalDateTime.now();
		task = myTask;
		id = NEXTID;
		NEXTID = NEXTID + 1;
		
	}
	
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	//Methods
	public void updateEndTime() {
		if (endTime == null) {
			endTime = LocalDateTime.now();
		}
	}

	public static int getNEXTID() {
		return NEXTID;
	}

	public String getProjectName() {
		return projectName;
	}

	public String getTask() {
		return task;
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}
	
	
	

}
