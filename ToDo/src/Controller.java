import java.util.List;
import java.util.ArrayList;

public class Controller {
	
	/* Member variables */

    ConsoleUtils consoleUtils;
    DAO DAO;
    
    
    

    
    /* Constructor */
    
    public Controller(){
        this.DAO = new DAO();
        this.consoleUtils = new ConsoleUtils();
        
    }
    
    public void start() {

    	consoleUtils.printHelp(); // Print the action menu

        boolean quit = false;
        while(!quit) {

			// Prompt the user for input, collect input, parse into parts
            String input = consoleUtils.promptString("> ");
            String[] actionParts = input.split(" ");
            String action = actionParts[0].trim(); // Primary action

			// Figure out what to do depending on the user's primary action
            if (action.equals("add")) {

                processAddAction();

            } else if (action.equals("delete")) {

                processDeleteAction(actionParts);

            } else if (action.equals("update")) {

                processUpdateAction(actionParts);

            } else if (action.equals("list")) {

                processListAction(actionParts);

            } else if (action.equals("quit")) {
            	
            	quit = true;

                // Your code here

            } else if (action.equals("help")) {
            	
            	consoleUtils.printHelp(); // Print the action menu

            	// Your code here

            } else if(action.length() ==0 ){
            
                // do nothing.
                
            } else {
            	consoleUtils.error("Invalid Action");
            
                // Your code here
                
            }
        }

    }
    

    
    public void processAddAction(){
        
        String description = consoleUtils.promptString("Description: ");
        DAO.add(description);
        consoleUtils.info("Item Added");

    }
    
    private void processUpdateAction(String[] actionParts) {
//    	if(actionParts.length >2) {
//    		consoleUtils.error("Too many inputs");
//    		return;
//    	}
    	
    	boolean validID=false;
    	while (!validID) {
    		try {
    			int id = Integer.parseInt(consoleUtils.promptString("Id to update: "));
    			checkIDExists(id-1);
    			System.out.println(id);
    			validID = true;
    		DAO.update(DAO.find(id-1));
    		consoleUtils.info("item marked as complete");
    		} catch (Exception e) {
    			consoleUtils.error("id does not exists");
    		}
    	}
    }
    
    private void checkIDExists(int ID) {
    	if(DAO.find(ID) == null) {
    		throw new IndexOutOfBoundsException();
    	}
    }
    
    
    private void processListAction(String[] actionParts) {
    	List<ToDoItem> item = new ArrayList<ToDoItem>();
    	if(actionParts.length>1) {
    		if(actionParts[1].toLowerCase().equals("done")) {
    			item = DAO.listToDoItem(true);
    			consoleUtils.printList(item);
    		} else if (actionParts[1].toLowerCase().equals("pending")) {
    			item = DAO.listToDoItem(false);
    			consoleUtils.printList(item);
    		}
    	} else {
    		item = DAO.listToDoItems();
    		consoleUtils.printList(item);
    	}
    }
    
    
    private void processDeleteAction(String[] actionParts) {
    	boolean validID=false;
    	while (!validID) {
    		try {
    			int id = Integer.parseInt(consoleUtils.promptString("Id to delete: "));
    			checkIDExists(id-1);
    			validID = true;
    		DAO.delete(DAO.find(id-1));
    		consoleUtils.info("item deleted");
    		} catch (Exception e) {
    			consoleUtils.error("id does not exists");
    		}
    	}
    	
    }



	
}
