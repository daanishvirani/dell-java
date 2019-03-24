
public class ToDoItem {
	
	//Creating variable in order to increment the id
	public static int NEXTid=1;
	
	//Variables
	private int id;
	private String description;
	private boolean completed_flag;
	
	//Setters & Getters 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isCompleted_flag() {
		return completed_flag;
	}
	public void setCompleted_flag(boolean completed_flag) {
		this.completed_flag = completed_flag;
	}
	
	//Constructor to create a new todo item
	public ToDoItem (String mydescription) {
		description = mydescription;
		completed_flag = false;
		id = NEXTid;
		NEXTid +=1;
	}
	
	public ToDoItem () {
	}
	
	
	

}
