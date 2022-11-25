package minesweeper3;

import java.util.Random;
import java.util.Scanner;

public class minesweeper {

	
	private int row;
	private int column;
	private boolean noMine;
	private int[][] visibleGrid = new int[10][10];
	public int[][] hiddenGrid = new int[10][10];
		
	
	
	// constructing game
	public minesweeper(int row, int column) {
		super();
		this.row = row;
		this.column = column;
		this.visibleGrid = visibleGrid;
		this.hiddenGrid = hiddenGrid;
		
		for (int i = 0; i < visibleGrid.length; i++) {
		       for (int j = 0; j < visibleGrid.length; j++) {
		           visibleGrid[i][j] = -1;           //assign values to each array element
		           System.out.print(visibleGrid[i][j] + " "); //print each element
		       }
		       System.out.println();  // printing line to separate them
			}
		
	}


	public void newGame() {
		// placing mines
		generateMines();
		
		// while revealed square is not a mine -> display the board and get user input
		// user input returns boolean
		// if chosen position = 9 game over
		// 90 moves - 10 mines
		
		noMine = true; // changed from false isMine
		while(noMine) {
//			displayBoard();
			noMine = userInput();

		}
		
		
	}
	
	



	
	

	public void displayBoard()  {
//		
//		// how to connect user input to displayed visible grid
//		// break down into initialising visiblegrid with -1 or change to string and put -
//		// print the visible grid
//		// compare input coordinates and reveal hiddengrid number to visible grid location and display...
//		// visibleGrid[I][j] = hiddenGrid[I][j]

//	
//		int[][] visibleGrid = new int[10][10];
	 
		for (int i = 0; i < visibleGrid.length; i++) {
		       for (int j = 0; j < visibleGrid.length; j++) {
		                    //assign values to each array element
		           System.out.print(visibleGrid[i][j] + " "); //print each element
		       }
		       System.out.println();  // printing line to separate them
			}
		
	
}
	
	public void generateMines() {
		
		// using random to choose 10 locations and assign 9. 
		
		int x = 0;
		while(x != 10) {
			 Random random = new Random();
			 int i = random.nextInt(10);
			 int j = random.nextInt(10);
			 hiddenGrid[i][j] = 9;
			 x++;
		}
		
		// calling generateField to assign the neighbour cells
		generateField();
	}
	
	
	public void generateField() {
		
		// neighbouringMines starting at 0, increasing for each adjacent mine. 
		
		
		
		for(int i =0; i < hiddenGrid.length; i++) {
			for( int j = 0; j < hiddenGrid[i].length; j++) {
				if (hiddenGrid[i][j] != 9) {
					
					int neighbourMines = 0;
					if (i !=0) {
						if (hiddenGrid[i -1][j] == 9) neighbourMines++;
						
						if (j != 0) {
							if (hiddenGrid[i - 1][j - 1] == 9) neighbourMines++;
					}
						
						if (i != 9) {
							if (hiddenGrid[i + 1][j] == 9) neighbourMines++;
							
							if( j != 9) {
								if (hiddenGrid[i +1][j +1] == 9) neighbourMines++;
							}
						}
						
						if (j != 0) {
							if (hiddenGrid[i][j - 1] == 9) neighbourMines++;
							
							if ( i != 9) {
								if (hiddenGrid[i + 1][j -1] == 9)neighbourMines++;
							}
						}
						
						if (j != 9) {
							if (hiddenGrid[i][j + 1] == 9) neighbourMines++;
							
							if (i != 0) {
								if (hiddenGrid[i - 1][j + 1] == 9) neighbourMines++;
							}
						}
					
					// each position will have a value of neighbourMines
					hiddenGrid[i][j] = neighbourMines;
					
					}
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
		System.out.println();
		System.out.println("Enter Row 0-9: ");
		int i = player.nextInt();
		
		System.out.println("Enter Column 0-9: ");
		int j = player.nextInt();
		
		int playerTurn = 0;
		
		if (i > 9 || i < 0 || j > 9 || j < 0) {
			System.out.println("Please choose a valid row/column 0-9");
			return true;
		}
		
		

		if (hiddenGrid[i][j] == 9) {
			System.out.println("You chose a mine! Game over!");
			return false;
		} else if (playerTurn == 90) {
			System.out.println("You discovered all the mines! Congrats!");
			return false;
		} else {
			visibleGrid[i][j] = hiddenGrid[i][j]; // add space?
			playerTurn++;
		}
		
		
		
		// trying to store guesses and see if duplicates.
		
//		int guesses[][] = new int [10][10];
//		
//		guesses[i][j] = hiddenGrid[i][j];
//		
//		for (i = 0; i < hiddenGrid.length; i++) {
//			for (j = 0; j < hiddenGrid.length; j++) {
//				if (guesses[i][j] == hiddenGrid[i][j]) {
//					System.out.println("You have already guessed this spot");
//				}
//			}
//		}
		
//		int count = 0;
//		
//		boolean repeat = false;
//		
//		for(int a = 0; a <= count; a++) {
//			for(int b = 0; b <= count; b++ ) {
//				if ()
//			}
//		}
		
		displayBoard();
		
		// how to connect other hiddenGrid values 0-8? to display board
		
		return true;
	}
	
//	public boolean duplicateInput() {
//		
//		int guesses[][] = new int [10][10];
//		int count = 0;
//		
//		
//	}
	
		
	}
	
	
	

