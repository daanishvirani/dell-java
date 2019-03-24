package tictactoe;
import java.util.Scanner;

public class Tic_Tac_Toe {

	public static char [][] board = new char [3][3];
	public static char player = 'O' ;
	static boolean noWinner = true;
	public static int player_row = 0;
	public static int player_column = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		initBoard();
		//printBoard();
		
		while(noWinner==true) {
			changePlayer();
			printBoard();
			AskForPlay();
			while(legalMove(player_row,player_column)==true) {
				System.out.println("This is an invalid move. Slot is taken or out of bounds. Please try again!");
				printBoard();
				AskForPlay();
			}
			moveBoard(player,player_row,player_column);
			printBoard();
			checkForWin(player,board);
			//checkForTie(board);
		}
		
		System.out.println("The winner is player " + player);

	

	}

	
	//initialize the board
	public static void initBoard() {
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				board[i][j] = ' ';
			}
		}
		System.out.println("Welcome to Tie-Tac-Toe! \n");
	}
	//Print Board
	public static void printBoard() {
		System.out.println(board[0][0] + " | " + board[0][1] + " | " + board [0][2]);
		System.out.println("_________");
		System.out.println(board[1][0] + " | " + board[1][1] + " | " + board [1][2]);
		System.out.println("_________");
		System.out.println(board[2][0] + " | " + board[2][1] + " | " + board [2][2]);
	}
	
	//Switch Player
	public static void changePlayer() {
		if (player == 'X') {
			player = 'O';
		} else {
			player = 'X';
		}
		System.out.println(" ");
		System.out.println("It is player " + player + " turn! Below you will see the current board. \n");
	}
	
	//Ask for player spot
	public static void AskForPlay() {
		System.out.println("Please select a slot position");
		System.out.println("Select a row: 0,1,2?");
		Scanner reader = new Scanner(System.in);
		player_row = reader.nextInt();
		System.out.println("Select a column: 0,1,2?");
		player_column = reader.nextInt();
		//reader.close();
		
	}
	
	
	//Check for a win
	public static void checkForWin(char player, char [][] board) {
		if (((board[0][0]==player) && (board[0][1]==player) && (board[0][2]==player)) ||
		((board[1][0]==player) && (board[1][1]==player) && (board[1][2]==player)) ||
		((board[2][0] == player)&&(board[2][1] == player)&&(board[2][2] == player)) ||
		((board[0][0] == player)&&(board[1][0] == player)&&(board[2][0] == player)) ||
		((board[0][1] == player)&&(board[1][1] == player)&&(board[2][1] == player)) ||
		((board[0][2] == player)&&(board[1][2] == player)&&(board[2][2] == player)) ||
		((board[0][0] == player)&&(board[1][1] == player)&&(board[2][2] == player)) ||
		((board[0][2] == player)&&(board[1][1] == player)&&(board[2][0] == player))) {
			noWinner = false;
		}

		}
	
	
	//Check if legal move
	public static boolean legalMove(int row, int column) {
		if ( (row > 2 || column >2) || (row<0 || column <0) ) {
			return true;
		} else if (board[row][column]=='X' || board[row][column]=='O') {
			return true;
		} else return false;
	}
	
	//Play valid move - place X or O on board
	public static void moveBoard(char player, int row, int column) {
		board[row][column] = player;
	}
	
	
	//Check if tie
	public static void checkForTie(char [][] board) {
		for (int i=0;i<3;i++) {
			for (int j=0; j<3; j++) {
				if (board[i][j]=='X' || board[i][j]=='O') {
					System.out.println("Game is a tie! Try again next time.");
				}
			}
		}
	}
	
	
	
	
}
