package minesweeper;

import java.util.Random;
import java.util.Scanner;

public class Minesweeper {

	
	private int row;
	private int column;
	private boolean noMine;
	private int[][] visibleGrid = new int[10][10];
	public int[][] hiddenGrid = new int[10][10];
		
	
	
	
	public Minesweeper(int row, int column) {
		super();
		this.row = row;
		this.column = column;
		this.visibleGrid = visibleGrid;
		this.hiddenGrid = hiddenGrid;
		
	}


	public void newGame() {
		// placing mines
		generateMines();
		
		// while revealed square is not a mine -> display the board and get user input
		// user input returns boolean
		// if chosen position = 9 game over
		
		noMine = true; // changed from false isMine
		while(noMine) {
//			displayBoard();
			noMine = userInput();
//			if(win condition?()) {
//				System.out.println("You found all the mines!");
//			}
		}
		
		
	}




	
	

//	public void displayBoard()  {
//		
//		// how to connect user input to displayed visible grid
//		// break down into initialising visiblegrid with -1 or change to string and put -
//		// print the visible grid
//		// compare input coordinates and reveal hiddengrid number to visible grid location and display...
//		
//	
//		for(int i = 0; i<rows; i++){
//			for(int j = 0; j<columns; j++)
//				visibleGrid[i][j] = -1; // -1 for unexplored space? 
//    }
//           
//			for (int i=0; i<visibleGrid.length; i++)
//    {
//				for (int j=0; j<visibleGrid[i].length; j++)
//	        {
//	            System.out.print(visibleGrid[i][j] + " ");
//	        }
//    System.out.println();
//    }
//}
	
	public void generateMines() {
		
		// using random to choose 10 locations and assign 9. 
		
		int x = 0;
		while(x != 10) {
			 Random random = new Random();
			 int i = random.nextInt(10);
			 int j = random.nextInt(10);
			 hiddenGrid[i][j] = 9;
		}
		
		// calling generateField to assign the neighbour cells
		generateField();
	}
	
	
	public void generateField() {
		
		// neighbouringMines starting at 0, increasing for each adjacent mine. 
		
		int neighbourMines = 0;
		
		for(int i =0; i < hiddenGrid.length; i++) {
			for( int j = 0; j < hiddenGrid[i].length; j++) {
				if (hiddenGrid[i][j] != 9) {
					// left
					if (hiddenGrid[i][j + 1] == 9) neighbourMines++;
					// right
					if (hiddenGrid[i][j - 1] == 9) neighbourMines++;
					// top
					if (hiddenGrid[i -1][j] == 9) neighbourMines++;
					// top right
					if (hiddenGrid[i - 1][j + 1] == 9) neighbourMines++;
					// top left
					if (hiddenGrid[i - 1][j - 1] == 9) neighbourMines++;
					// bottom
					if (hiddenGrid[i + 1][j] == 9) neighbourMines++;
					// bottom right
					if (hiddenGrid[i +1][j +1] == 9) neighbourMines++;
					// bottom left
					if (hiddenGrid[i + 1][j -1] == 9)neighbourMines++;
					
					// each position will have a value of neighbourMines
					hiddenGrid[i][j] = neighbourMines;
					
				}
			}
		}
	}
	
	
	public boolean userInput() {
		// enter row and column as x y coordinate
		// connected input to hiddenGrid position
		// if 9 -> game over and noMine false
		// if 
		
		Scanner player = new Scanner(System.in);
		System.out.println("Enter Row 0-9: ");
		int i = player.nextInt();
		
		System.out.println("Enter COlumn 0-9: ");
		int j = player.nextInt();
		
		
		if (hiddenGrid[i][j] == 9) {
			System.out.println("Game over!");
			return false;
		}
		
		// how to connect other hiddenGrid values 0-8? to displayboard
		
		return true;
	}
	
		
	}
	
	
	

