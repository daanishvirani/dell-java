import java.util.ArrayList;
import java.util.List;

public class DAO {
	
	//Create a arraylist with todoitems inside of it
	private List <ToDoItem> database;
	
	//Create Constructor to create a new database to store todo list items
	public DAO() {
		database = new ArrayList<ToDoItem>();
	}
	
	
	
	//Update Method - change completed flag to true
	public void update(ToDoItem todo) {
		todo.setCompleted_flag(true);
	}
	
	
	//Add method - add a new todo item
	public void add(String description) {
		ToDoItem newTodoItem = new ToDoItem(description);
		database.add(newTodoItem);
	}
	
	//delete method
	public void delete(ToDoItem todo) {
		int deleteEntry = database.indexOf(todo);
		database.remove(deleteEntry);
		
	}
	
	//List method
	public List<ToDoItem> listToDoItems(){
		return database;
	}
	
	//List method based on showing completed items
	public List<ToDoItem> listToDoItem(boolean done){
		//list non completed items
		if(!done) {
			List<ToDoItem> pendingDatabase = new ArrayList<ToDoItem>();
			for (ToDoItem e: database) {
				boolean done_1 = e.isCompleted_flag();
				if(!done_1) {
					pendingDatabase.add(e);
					
				}
			}
			
			return pendingDatabase;
		} else {
			List<ToDoItem> doneDatabase = new ArrayList<ToDoItem>();
			for(ToDoItem e: database) {
				boolean done_1 = e.isCompleted_flag();
				if(done_1) {
					doneDatabase.add(e);
				}
			}
			return doneDatabase;
		}
	}
	
	//Return todo entry based on ID
	public ToDoItem find(int id) {
		return database.get(id);
	}

}
