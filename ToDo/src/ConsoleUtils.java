import java.util.List;
import java.util.Scanner;

public class ConsoleUtils {

	/* Member variables */
	
    private Scanner scanner;
       
    /* Constructor */
    
    public ConsoleUtils(){
        scanner = new Scanner(System.in);
       
    }

	/* Methods */
	
	/*
	 * Prints the menu of actions to the console
	 */
    public void printHelp(){
        System.out.println("Avaiable Functions: ");
        System.out.println("  add                   add an item");
        System.out.println("  delete                to delete an item");
        System.out.println("  update             the item to mark as done");
        System.out.println("  list [pending]          to list the pending items");
        System.out.println("  list [done]             to list the done items");
        System.out.println("  help                  display avaiable function");
        System.out.println("  quit                  to exit");
        System.out.println();

    }

	/*
	 * Prints an informational message to the console
	 */
    public void info(String msg){
        System.out.println("["+msg+"]");
        System.out.println();
    }

	/*
	 * Prints an error message to the console
	 */
    public void error(String msg){
        System.out.println("[ERROR: "+msg+"]");
        System.out.println();
        }

	/*
	 * Prompts the user to enter input
	 * Returns the text entered by the user
	 */
    public String promptString(String label){
        System.out.print(label+" ");
        return scanner.nextLine();
    }

	/*
	 * Prints a list of TimesheetEntry objects in a pretty table
	 */
    public void printList(List<ToDoItem> todo){
        int longestitem =  12;

        for(ToDoItem entry : todo){
            if(entry.getDescription().length() > longestitem){
                longestitem = entry.getDescription().length();
            }
        }

        String projectHeader = String.format("%"+longestitem+"s", "Description");
        String projectUnderline = "";
        for(int i=0;i<longestitem;i++){
            projectUnderline+="-";
        }
        


        System.out.println(" ID | "+projectHeader +" | Status");
        System.out.println("----+-"+projectUnderline+"-+----------------");

        for(ToDoItem entry : todo){
            String project = String.format("%-"+longestitem+"s", entry.getDescription());
           // String task = String.format("%-"+longestTask+"s", entry.getTask());
            //String startTime = entry.getStartTime().format(timeFormatter);
            //String endTime = "";
            //if(entry.getEndTime() != null){
              //  endTime = entry.getEndTime().format(timeFormatter);
           // }
            String status = "";
            if(entry.isCompleted_flag()) {
            	status = "Done";
            } else {
            	status = "Pending";
            }
            String line = String.format(" %2s | %s | %s ", entry.getId(), project, status);
            System.out.println(line);
        }

        if(todo.size() == 1){
            System.out.println("[1 entry]");
        } else {
            System.out.println("["+todo.size()+" entries]");
        }

        System.out.println();
    }
	
	
}
