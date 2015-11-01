package test;

import displayGame.AbstractConsoleDisplayer;
import displayGame.RectangularConsoleDisplayer;

public class TestConsoleEasyRectangularBoard {

	public static void main(String[] args) {

		System.out.println("--- TestConsoleEasyRectangularBoard ---");
		System.out.println("");
		System.out.println("Generating the board");
		AbstractConsoleDisplayer consoleDisplayer = RectangularConsoleDisplayer.easyRectangularConsoleDisplayer();
		System.out.println("");
		System.out.println("Displaying the board");
		consoleDisplayer.displayBoard();
		System.out.println("");
		System.out.println("Revealing all the cells");
		consoleDisplayer.revealAllBoard();
		System.out.println("");
		System.out.println("Displaying the board");
		consoleDisplayer.displayBoard();		
		
	}
}
