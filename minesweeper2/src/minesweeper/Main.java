package minesweeper3;


import java.util.Random;
import java.util.Scanner;

public class Main {
//	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("-------->Minesweeper<--------");
		System.out.println();
		System.out.println("Enter a row and column between 0-9 to avoid the mines");
		System.out.println();

		 minesweeper game = new minesweeper(10,10);
		
		// 10 mines 10 x 10 grid
		// enter row and column to check for mine
		// visible field shows 0-8 depending on surrounding mines
		// or 9 for a mine
		// tried having visibleGrid as String of '-'
		// separate into board, mines, cell?
		
		// new game -> calls generateMines -> generatesField -> while noMine = true, displayboard and get userinput -> minerevealed noMine = false, game over
		// How to check if won? 
		// 
		// How to connect input to displayedboard and reveal hiddengrid? 
		// 
		
		
		
//		displayBoard();
//		
//		while(true) {
//		game.userInput();
//		}
		
		game.newGame();
		
		
//		 int[][] visibleGrid = new int[10][10];
//		 int[][] hiddenGrid =  new int[10][10];
		 
//		 newgame();
		 
		
	}
	
	// testing if working - can't run app
	public static void displayBoard()  {
		// https://java2blog.com/initialize-2d-array-java/
		// deepToString?
		
		int[][] visibleGrid = new int[10][10];
		 
		for (int i = 0; i < visibleGrid.length; i++) {
            for (int j = 0; j < visibleGrid.length; j++) {
                visibleGrid[i][j] = -1;           //assign values to each array element
                System.out.print(visibleGrid[i][j] + " "); //print each element
            }
            System.out.println();  // printing line to separate them
		
	
		}
	
	}
	
	
	
//	public static  void newGame() {
//	generateMines();
//	
//	boolean choseMine = true;
//	
//	while(choseMine) {
//		displayBoard();
//		choseMine = userInput();
////		if(checkWin()) {
////			System.out.println("You found all the mines!");
////		}
//	}
//	
//	
//}
//
//
//
//
//public static void displayBoard()  {
//    System.out.print("\t ");
//    for(int i=0; i<10; i++)
//    {
//        System.out.print(" " + i + "  ");
//    }
//    System.out.print("\n");
//    for(int i=0; i<10; i++)
//    {
//        System.out.print(i + "\t| ");
//        for(int j=0; j<10; j++)
//        {
//            if(visibleGrid[i][j]==0)
//            {
//                System.out.print("?");
//            }
//            else if(visibleGrid[i][j]==50)
//            {
//                System.out.print(" ");
//            }
//            else
//            {
//                System.out.print(visibleGrid[i][j]);
//            }
//            System.out.print(" | ");
//        }
//        System.out.print("\n");
//    }
//}
//
//public static void generateMines() {
//	
//	int x = 0;
//	while(x != 10) {
//		 Random random = new Random();
//		 int i = random.nextInt(10);
//		 int j = random.nextInt(10);
//		 hiddenGrid[i][j] = 9;
//	}
//	
//	generateField();
//}
//
//public static void generateField() {
//	
//	int neighbourMines = 0;
//	
//	for(int i =0; i < hiddenGrid.length; i++) {
//		for( int j = 0; j < hiddenGrid[i].length; j++) {
//			if (hiddenGrid[i][j] != 9) {
//				// left
//				if (hiddenGrid[i][j + 1] == 9) neighbourMines++;
//				// right
//				if (hiddenGrid[i][j - 1] == 9) neighbourMines++;
//				// top
//				if (hiddenGrid[i -1][j] == 9) neighbourMines++;
//				// top right
//				if (hiddenGrid[i - 1][j + 1] == 9) neighbourMines++;
//				// top left
//				if (hiddenGrid[i - 1][j - 1] == 9) neighbourMines++;
//				// bottom
//				if (hiddenGrid[i + 1][j] == 9) neighbourMines++;
//				// bottom right
//				if (hiddenGrid[i +1][j +1] == 9) neighbourMines++;
//				// bottom left
//				if (hiddenGrid[i + 1][j -1] == 9)neighbourMines++;
//				
//				hiddenGrid[i][j] = neighbourMines;
//				
//			}
//		}
//	}
//}
//
//
//public static boolean userInput() {
//	
//	Scanner player = new Scanner(System.in);
//	System.out.println("Enter Row 0-9: ");
//	int i = player.nextInt();
//	System.out.println("Enter COlumn 0-9: ");
//	int j = player.nextInt();
//	
//	if (hiddenGrid[i][j] == 9) {
//		System.out.println("Game over!");
//		return false;
//	}
//	else if (hiddenGrid[i][j] == 0) {
//		visibleGrid[i][j] = '0';
//	}
//	else {
//		visibleGrid[i][j] = hiddenGrid[i][j] + '0';
//	}
//	
//	return true;
//}
//
//	
//}
//


}
